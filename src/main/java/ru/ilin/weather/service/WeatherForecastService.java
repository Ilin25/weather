package ru.ilin.weather.service;

import ru.ilin.weather.entity.Weather;
import ru.ilin.weather.entity.WeatherForecast;
import ru.ilin.weather.model.response.WeatherForecastResponse;

public interface WeatherForecastService {

     WeatherForecast addWeatherForecast();

    WeatherForecast sendQueryAPI();
}
