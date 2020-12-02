package ru.ilin.weather.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ilin.weather.entity.WeatherForecast;
import ru.ilin.weather.service.WeatherForecastService;

@RestController
@RequestMapping("/")
public class WeatherForecastController {

    private WeatherForecastService weatherForecastService;

    @Autowired
    public WeatherForecastController(WeatherForecastService weatherForecastService) {
        this.weatherForecastService = weatherForecastService;
    }

    @GetMapping("test")
    public WeatherForecast addWeatherForecast(){
        return weatherForecastService.sendQueryAPI();
    }
}
