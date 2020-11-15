package ru.ilin.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MainParametersForecast {
    @Id
    private long id;
    private double temp;// температура
    private double feels_like;//чувствуется как
    private int pressure;//давление
    private int humidity;//влажность
    private double temp_min;//минимальная температура
    private double temp_max;//максимальная температура
    private int sea_level;//атм давление на уровне моря
    private int grnd_level;//атм давление на уровне земли
    @OneToOne
    private WeatherForecast weatherForecast;

}
