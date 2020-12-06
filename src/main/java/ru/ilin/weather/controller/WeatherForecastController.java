package ru.ilin.weather.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import ru.ilin.weather.entity.WeatherForecast;
import ru.ilin.weather.service.WeatherForecastService;
@EnableScheduling
@RestController
@RequestMapping("/")
public class WeatherForecastController {

    private WeatherForecastService weatherForecastService;

    @Autowired
    public WeatherForecastController(WeatherForecastService weatherForecastService) {
        this.weatherForecastService = weatherForecastService;
    }


    @Scheduled(fixedDelay = 10000)
    @GetMapping("test")
    public WeatherForecast addWeatherForecast(){
        return weatherForecastService.addWeatherForecast();
    }
}