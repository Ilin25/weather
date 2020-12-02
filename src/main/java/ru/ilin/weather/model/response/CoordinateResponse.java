package ru.ilin.weather.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoordinateResponse{//Координаты

    private double lon;//долгота
    private double lat;//широта

}
