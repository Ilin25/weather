
    package ru.ilin.weather.model.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.ilin.weather.entity.WeatherForecast;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor

    public class WeatherResponse  {//погода

        private int id;//идентификатор погодных условий
        private String main;//Группа погодных параметров
        private String description;//Погодные условия в группе
        private String icon;//Идентификатор значка погоды
        private WeatherForecast weatherForecast;

    }
