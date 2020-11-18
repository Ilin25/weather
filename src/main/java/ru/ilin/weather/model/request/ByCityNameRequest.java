package ru.ilin.weather.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ByCityNameRequest {// запрос погоды по названию города

    private String cityName;

}
