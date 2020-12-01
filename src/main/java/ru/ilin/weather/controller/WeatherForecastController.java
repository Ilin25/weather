package ru.ilin.weather.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.ilin.weather.entity.Clouds;
import ru.ilin.weather.entity.WeatherForecast;
import ru.ilin.weather.model.request.ByCityNameRequest;
import ru.ilin.weather.model.response.WeatherForecastResponse;
import ru.ilin.weather.service.WeatherForecastService;

@RestController
@RequestMapping("/")
public class WeatherForecastController {

    private WeatherForecastService weatherForecastService;

    @Autowired
    public WeatherForecastController(WeatherForecastService weatherForecastService) {
        this.weatherForecastService = weatherForecastService;
    }

    @RequestMapping("/")
    public void addWeatherForecast(){
        weatherForecastService.addWeatherForecast();
    }
}
