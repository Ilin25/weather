package ru.ilin.weather.service;

import ru.ilin.weather.entity.WeatherForecast;
import ru.ilin.weather.model.response.WeatherForecastResponse;

public interface WeatherForecastService {

    void addWeatherForecast();

    WeatherForecast sendQueryAPI();
}
