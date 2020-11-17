package ru.ilin.weather.model;



public class RainResponse {//дождь

    private long id;
    private int theOneHour;//объём дождя за последний один час
    private int forThreeHours;//объём дождя за последние три часа
    private WeatherForecastResponse weatherForecastResponse;
}
