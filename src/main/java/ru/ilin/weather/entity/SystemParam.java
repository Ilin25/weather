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
public class SystemParam {//Системные параметры
    @Id
    private long id;
    private int type;//Внутренний параметр
    private long id_internalParameter;//Внутренний параметр
    private String message;//Внутренний параметр
    private String country;//Код страны
    private String sunrise;//Время восхда,unix,UTC
    private String sunset;//Время заката ,unix,UTC
    @OneToOne
    private WeatherForecast weatherForecast;
}
