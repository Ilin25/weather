package ru.ilin.weather.model;



public class WeatherResponse {//погода
    private long id;
    private int weatherConditions_id;//идентификатор погодных условий
    private String groupWeatherParameter;//Группа погодных параметров
    private String description;//Погодные условия в группе
    private String icon_id;//Идентификатор значка погоды
    private WeatherForecastResponse weatherForecastResponse;
}
