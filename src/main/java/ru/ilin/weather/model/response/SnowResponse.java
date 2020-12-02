package ru.ilin.weather.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SnowResponse {//снег

    private int theOneHour;//TODO//объём снега за последний один час
    private int forThreeHours;//TODO//объём снега за последние три часа
}

