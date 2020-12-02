package ru.ilin.weather.model.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WindResponse {

    private double speed;//скорость ветра
    private double deg;//направление ветра в градусах
    private double gust;//порывы ветра

}
