package ru.ilin.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "main_parameters_forecast")

public class MainParametersForecast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "temp")
    private double temp;// температура

    @Column(name = "feels_like")
    private double feels_like;//чувствуется как

    @Column(name = "pressure")
    private long pressure;//давление

    @Column(name = "humidity")
    private int humidity;//влажность

    @Column(name = "temp_min")
    private double temp_min;//минимальная температура

    @Column(name = "temp_max")
    private double temp_max;//максимальная температура

    @Column(name = "sea_level")
    private long sea_level;//атм давление на уровне моря

    @Column(name = "grnd_level")
    private long grnd_level;//атм давление на уровне земли

}
