package ru.ilin.weather.model;



public class WindResponse {

    private long Id;
    private double speed;//скорость ветра
    private double deg;//направление ветра в градусах
    private double gust;//порывы ветра
    private WeatherForecastResponse weatherForecastResponse;

}
