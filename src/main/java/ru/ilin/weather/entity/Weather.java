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
@Table(name = "weather")
//название класса и полей полностью совпалдает с названиями в БД
public class Weather {//погода
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "weather_conditions_id")
    private int weatherConditions_id;//идентификатор погодных условий
    @Column(name = "group_weather_parameter")
    private String groupWeatherParameter;//Группа погодных параметров
    @Column(name = "description")
    private String description;//Погодные условия в группе
    @Column(name = "icon_id")
    private String icon_id;//Идентификатор значка погоды
    @ManyToOne
    @JoinColumn(name = "weather_forecast_id")
    private WeatherForecast weatherForecast;
}
