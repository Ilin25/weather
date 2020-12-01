package ru.ilin.weather.model.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SystemParamResponse {//Системные параметры

    private long id;
    private int type;//Внутренний параметр
    private long id_internalParameter;//Внутренний параметр
    private String message;//Внутренний параметр
    private String country;//Код страны
    private long sunrise;//Время восхда,unix,UTC
    private long sunset;//Время заката ,unix,UTC

}
