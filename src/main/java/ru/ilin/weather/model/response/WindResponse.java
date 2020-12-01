package ru.ilin.weather.model.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class WindResponse {
    private long Id;
    private double speed;//скорость ветра
    private double deg;//направление ветра в градусах
    private double gust;//порывы ветра

}
