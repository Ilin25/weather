package ru.ilin.weather.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MainParametersForecastResponse {

    private double temp;// температура
    private double feels_like;//чувствуется как
    private long pressure;//давление
    private int humidity;//влажность
    private double temp_min;//минимальная температура
    private double temp_max;//максимальная температура
    private long sea_level;//атм давление на уровне моря
    private long grnd_level;//атм давление на уровне земли

}
