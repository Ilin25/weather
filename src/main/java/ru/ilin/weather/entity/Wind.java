package ru.ilin.weather.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Wind {
    @Id
    private long Id;
    private double speed;//скорость ветра
    private double deg;//направление ветра в градусах
    private double gust;//порывы ветра
    @OneToOne
    private WeatherForecast weatherForecast;

}
