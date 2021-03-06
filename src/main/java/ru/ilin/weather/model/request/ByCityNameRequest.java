package ru.ilin.weather.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ByCityNameRequest {//запрос погоды по названию города

    private String cityName;//название города
    private final String appId = "c5b176e41c8857bd58de2154a0b56949";//id
    private final String units = "metric";//единицы измерения(м/с,град.Цельсия)
    private final String lang = "ru";//язык Русский

}
