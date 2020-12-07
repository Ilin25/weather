
    package ru.ilin.weather.model.response;


import com.fasterxml.jackson.annotation.JsonSetter;
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
        @JsonSetter("id")
        private int weatherConditions_id;//идентификатор погодных условий
        @JsonSetter("main")
        private String groupWeatherParameter;//Группа погодных параметров
        private String description;//Погодные условия в группе
        @JsonSetter("icon")
        private String icon_id;//Идентификатор значка погоды
        private WeatherForecastResponse weatherForecastResponse;

    }
