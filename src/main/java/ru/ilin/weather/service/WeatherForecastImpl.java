package ru.ilin.weather.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.ilin.weather.entity.*;
import ru.ilin.weather.model.request.ByCityNameRequest;
import ru.ilin.weather.model.response.WeatherForecastResponse;
import ru.ilin.weather.repository.WeatherForecastRepository;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class WeatherForecastImpl implements WeatherForecastService {

    private WeatherForecastRepository weatherForecastRepository;


    @Autowired
    public WeatherForecastImpl(WeatherForecastRepository weatherForecastRepository) {
        this.weatherForecastRepository = weatherForecastRepository;

    }

    @Override
    public WeatherForecast addWeatherForecast() {
        WeatherForecast weatherForecast = sendQueryAPI();
        long timeCalculationData = weatherForecast.getDt();
        if (!filteringIdenticalDates(timeCalculationData) && timeCalculationData!=0) {
            weatherForecastRepository.save(weatherForecast);
        }

        return weatherForecast;
    }


    @Override
    public WeatherForecast getWeatherForecast(long date) {
        long dateResponse = searchDateWeatherForecast(date);
        return weatherForecastRepository.getWeatherForecast(dateResponse);
    }


    private WeatherForecast sendQueryAPI() { // отправляет запрос к Api Weather Forecast на получение пргноза в городе Москва
        RestTemplate restTemplate = new RestTemplate();
        ByCityNameRequest byCityNameRequest = new ByCityNameRequest("Москва");
        String fooResourceUrl
                = "http://api.openweathermap.org/data/2.5/weather?" +
                "q=" + byCityNameRequest.getCityName() + "&" +
                "appid=" + byCityNameRequest.getAppId() + "&" +
                "lang=" + byCityNameRequest.getLang() + "&" +
                "units=" + byCityNameRequest.getUnits();

        WeatherForecastResponse response
                = restTemplate.getForObject(fooResourceUrl, WeatherForecastResponse.class);

        ModelMapper modelMapper = new ModelMapper();
        WeatherForecast weatherForecast = modelMapper.map(response, WeatherForecast.class);
        Weather weather = modelMapper.map(response.getWeather().get(0), Weather.class);
        weatherForecast.setWeather(Arrays.asList(weather));
        weather.setWeatherForecast(weatherForecast);
        return weatherForecast;//возвращает прогноз погоды сформированный из ответа от Api
    }

    private boolean filteringIdenticalDates(Long data) {//проверка передаваемого прогноза на наличие в базе
        boolean flag = weatherForecastRepository.filteringIdenticalDates(data);
        return flag;// есть/нет - true/false
    }

    private long searchDateWeatherForecast(Long date) {// поиск ближайшей даты измерений к дате из запроса клиента
        List<Long> dateWeatherForecast
                = weatherForecastRepository.getListDate().stream().// вернуть список всех дат измерений из базы
                distinct().//оставить уникальные
                collect(Collectors.toList());
        Long max = dateWeatherForecast.stream().max(Long::compareTo).get();//вернуть минимальное значение даты
        Long min = dateWeatherForecast.stream().min(Long::compareTo).get();// вернуть макс значение даты
        if (date <= min) {
            return min;
        }
        if (date >= max) {
            return max;
        }
        dateWeatherForecast.add(date);//добавить дату из запроса в лист
        dateWeatherForecast.sort(Long::compareTo);//отсортировать
        int index = dateWeatherForecast.indexOf(date);// узнать индекс переданного значения даты из запроса
        long dateMin = dateWeatherForecast.get(index-1);// получить соседнее число меньше переданного значения
        long dateMax = dateWeatherForecast.get(index+1);//получить соседнеее число больше переданного значения
        if (date-dateMin >= dateMax-date) {// вычислить какое из чисел ближе к переданному
            return dateMax;
        }
        if(dateMax-date > date-dateMin){// вычислить какое из чисел ближе к переданному
            return dateMin;
        }

        return 0;
    }

}
