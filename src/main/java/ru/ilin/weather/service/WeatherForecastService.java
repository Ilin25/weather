package ru.ilin.weather.service;

import ru.ilin.weather.entity.WeatherForecast;

public interface WeatherForecastService {

     WeatherForecast addWeatherForecast();
     WeatherForecast getWeatherForecast(long date);


}
