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
//название класса и полей полностью совпалдает с названиями в БД
public class WeatherForecast {// Прогноз погоды
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @OneToOne
    private Coordinate coord; //географическое положение города
    @OneToMany(mappedBy = "weatherForecast", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Weather> weathers; //погода
    @Column(name = "base")
    private String base; //станция
    @OneToOne
    private MainParametersForecast main;//главные параметры
    @Column(name = "visibility")
    private String visibility;//видимость
    @OneToOne
    private Wind wind;//ветер
    @OneToOne
    private Clouds clouds;//облачность
    @OneToOne
    private Rain rain;//дождь
    @OneToOne
    private Snow snow;//снег
    @Column(name = "timeCalculationData")
    private long timeCalculationData;//время расчета данных ,unix,UTC
    @OneToOne
    private SystemParam sys;//системные параметры
    @Column(name = "timezone")
    private long timezone;//Сдвиг в секундах от UTC
    @Column(name = "cityId")
    private int cityId;// id города
    @Column(name = "nameCity")
    private String nameCity;// название города
    @Column(name = "codeCity")
    private int codeCity;//Внутренний параметр(код города)






}
