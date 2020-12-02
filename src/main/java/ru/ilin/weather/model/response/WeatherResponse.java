package ru.ilin.weather.model.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ru.ilin.weather.entity.WeatherForecast;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {//погода

    private int id;//идентификатор погодных условий
    private String main;//Группа погодных параметров
    private String description;//Погодные условия в группе
    private String icon;//Идентификатор значка погоды

}
