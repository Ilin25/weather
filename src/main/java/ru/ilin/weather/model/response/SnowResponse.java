package ru.ilin.weather.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SnowResponse {//снег

    private long id;
    private int theOneHour;//объём снега за последний один час
    private int forThreeHours;//объём снега за последние три часа
}

