package ru.ilin.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ilin.weather.entity.Clouds;
import ru.ilin.weather.entity.WeatherForecast;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("/{name}")
    public String getNameCity(@PathVariable("name") String name){
        WeatherForecast weatherForecast = new WeatherForecast();
        return "Hello " + name;
    }
}
