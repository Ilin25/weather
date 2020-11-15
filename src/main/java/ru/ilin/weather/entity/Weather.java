package ru.ilin.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Weather {//погода
    @Id
    private long id;
    private int id_weatherConditions;//идентификатор погодных условий
    private String main;//Группа погодных параметров
    private String description;//Погодные условия в группе
    private String icon;//Идентификатор значка погоды
    @ManyToOne
    private WeatherForecast weatherForecast;
}
