package ru.ilin.weather.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "weather_forecast")
//название класса и полей полностью совпалдает с названиями в БД
public class WeatherForecast {// Прогноз погоды
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coordinate_id")
    private Coordinate coord; //географическое положение города

    @OneToMany(mappedBy = "weatherForecast", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Weather> weathers; //погода

    @Column(name = "base")
    private String base; //станция

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "main_parameters_forecast_id")
    private MainParametersForecast main;//главные параметры

    @Column(name = "visibility")
    private String visibility;//видимость

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wind_id")
    private Wind wind;//ветер

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clouds_id")
    private Clouds clouds;//облачность

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rain_id")
    private Rain rain;//дождь

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "snow_id")
    private Snow snow;//снег

    @Column(name = "time_calculation_data")
    private long timeCalculationData;//время расчета данных ,unix,UTC

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "system_param_id")
    private SystemParam sys;//системные параметры

    @Column(name = "time_zone")
    private long timezone;//Сдвиг в секундах от UTC

    @Column(name = "city_id")
    private int cityId;// id города

    @Column(name = "name_city")
    private String nameCity;// название города

    @Column(name = "code_city")
    private int codeCity;//Внутренний параметр(код города)

    public WeatherForecast(
            Coordinate coord,
            List<Weather> weathers,
            String base,
            MainParametersForecast main,
            String visibility,
            Wind wind,
            Clouds clouds,
            Rain rain,
            Snow snow,
            long timeCalculationData,
            SystemParam sys,
            long timezone,
            int cityId,
            String nameCity,
            int codeCity) {
        this.coord = coord;
        this.weathers = weathers;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.rain = rain;
        this.snow = snow;
        this.timeCalculationData = timeCalculationData;
        this.sys = sys;
        this.timezone = timezone;
        this.cityId = cityId;
        this.nameCity = nameCity;
        this.codeCity = codeCity;
    }
}
