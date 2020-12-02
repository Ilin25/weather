package ru.ilin.weather.model.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RainResponse {//дождь

    private int theOneHour;//TODO//объём дождя за последний один час
    private int forThreeHours;//TODO//объём дождя за последние три часа

}
