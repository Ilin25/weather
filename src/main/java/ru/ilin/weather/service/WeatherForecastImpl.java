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


@Service
public class WeatherForecastImpl implements WeatherForecastService {

    private WeatherForecastRepository weatherForecastRepository;
    private WeatherForecast weatherForecast;



    @Autowired
    public WeatherForecastImpl(WeatherForecastRepository weatherForecastRepository) {
        this.weatherForecastRepository = weatherForecastRepository;

    }

    @Override
    public WeatherForecast addWeatherForecast() {
        weatherForecastRepository.save(sendQueryAPI());
        return weatherForecast;
    }


    private WeatherForecast sendQueryAPI() {
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
        weatherForecast = modelMapper.map(response,WeatherForecast.class);
        Weather weather = modelMapper.map(response.getWeather().get(0),Weather.class);
        weatherForecast.setWeather(Arrays.asList(weather));
        weather.setWeatherForecast(weatherForecast);
        return weatherForecast;
    }

}
