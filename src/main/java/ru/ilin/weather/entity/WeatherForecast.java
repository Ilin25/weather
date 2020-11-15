package ru.ilin.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "weatherForecast")
public class WeatherForecast {// Прогноз погоды
    @Id
    private long id;
    @OneToOne
    private Coordinate coord; //географическое положение города
    @OneToMany
    private List<Weather> weather; //погода
    private String base; //станция
    @OneToOne
    private MainParametersForecast main;//главные параметры
    private String visibility;//видимость
    @OneToOne
    private Wind wind;//ветер
    @OneToOne
    private Clouds clouds;//облачность
    @OneToOne
    private Rain rain;//дождь
    @OneToOne
    private Snow snow;//снег
    private long dt;//время расчета данных ,unix,UTC
    @OneToOne
    private SystemParam sys;//системные параметры
    private int timezone;//Сдвиг в секундах от UTC
    private long City_id;// id города
    private String name;// название города
    private int code;//Внутренний параметр






}
