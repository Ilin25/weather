package ru.ilin.weather.model;


public class MainParametersForecastResponse {

    private long id;
    private double temp;// температура
    private double feels_like;//чувствуется как
    private int pressure;//давление
    private int humidity;//влажность
    private double temp_min;//минимальная температура
    private double temp_max;//максимальная температура
    private int sea_level;//атм давление на уровне моря
    private int grnd_level;//атм давление на уровне земли
    private WeatherForecastResponse weatherForecastResponse;

}
