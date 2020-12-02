package ru.ilin.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.ilin.weather.entity.SystemParam;
import ru.ilin.weather.entity.Weather;
import ru.ilin.weather.entity.WeatherForecast;
import ru.ilin.weather.model.request.ByCityNameRequest;
import ru.ilin.weather.model.response.SystemParamResponse;
import ru.ilin.weather.model.response.WeatherForecastResponse;
import ru.ilin.weather.model.response.WeatherResponse;
import ru.ilin.weather.repository.WeatherForecastRepository;

import java.util.Arrays;
import java.util.List;

@Service
public class WeatherForecastImpl implements WeatherForecastService {

    private WeatherForecastRepository weatherForecastRepository;

    @Autowired
    public WeatherForecastImpl(WeatherForecastRepository weatherForecastRepository) {
        this.weatherForecastRepository = weatherForecastRepository;

    }

    @Override
    public void addWeatherForecast() {
        weatherForecastRepository.save(sendQueryAPI());
    }


    @Override
    public WeatherForecast sendQueryAPI() {
        RestTemplate restTemplate = new RestTemplate();
        ByCityNameRequest byCityNameRequest = new ByCityNameRequest("Москва");
        String fooResourceUrl
                = "http://api.openweathermap.org/data/2.5/weather?" +
                "q=" + byCityNameRequest.getCityName() + "&" +
                "appid=" + byCityNameRequest.getAppId() + "&" +
                "lang=" + byCityNameRequest.getLang() + "&" +
                "units=" + byCityNameRequest.getUnits();

        WeatherForecastResponse response = restTemplate.getForObject(fooResourceUrl, WeatherForecastResponse.class);

        WeatherForecast currentWeather = new WeatherForecast();
        currentWeather.setCoord(response.getCoord());
        currentWeather.setWeathers(weatherResponseToWeather(response.getWeather().get(0)));
        currentWeather.setBase(response.getBase());
        currentWeather.setMain(response.getMain());
        currentWeather.setVisibility(response.getVisibility());
        currentWeather.setWind(response.getWind());
        currentWeather.setClouds(response.getClouds());
        currentWeather.setRain(response.getRain());
        currentWeather.setSnow(response.getSnow());
        currentWeather.setTimeCalculationData(response.getDt());
        currentWeather.setSys(systemParamResponseToSystem(response.getSys()));
        currentWeather.setTimezone(response.getTimezone());
        currentWeather.setCityId(response.getId());
        currentWeather.setNameCity(response.getName());
        currentWeather.setCodeCity(response.getCod());

        weatherForecastRepository.save(currentWeather);
        return currentWeather;
    }

    private SystemParam systemParamResponseToSystem(SystemParamResponse systemParamResponse) {

        return new SystemParam(systemParamResponse.getType(),
                systemParamResponse.getId(),
                systemParamResponse.getMessage(),
                systemParamResponse.getCountry(),
                systemParamResponse.getSunrise(),
                systemParamResponse.getSunset());
    }

    private List<Weather> weatherResponseToWeather(WeatherResponse weatherResponse) {
        Weather weather = new Weather(
                weatherResponse.getId(),
                weatherResponse.getMain(),
                weatherResponse.getDescription(),
                weatherResponse.getIcon(),
                weatherResponse.getWeatherForecast());

        return Arrays.asList(weather);
    }
}
