package ru.ilin.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "coordinate")
public class Coordinate implements Serializable {//Координаты
    @Id
    private long id;
    private String lon;//долгота
    private String lat;//широта
    @OneToOne
    @JoinColumn(name = "weatherForecast_id")
    private WeatherForecast weatherForecast;
}
