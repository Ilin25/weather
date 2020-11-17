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
@Table(name = "systemParam")
//название класса и полей полностью совпалдает с названиями в БД
public class SystemParam {//Системные параметры
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "type")
    private int type;//Внутренний параметр
    @Column(name = "id_internalParameter")
    private long id_internalParameter;//Внутренний параметр
    @Column(name = "message")
    private String message;//Внутренний параметр
    @Column(name = "country")
    private int country;//Код страны
    @Column(name = "sunrise")
    private long sunrise;//Время восхда,unix,UTC
    @Column(name = "sunset")
    private long sunset;//Время заката ,unix,UTC
    @OneToOne
    private WeatherForecast weatherForecast;
}
