package ru.ilin.weather.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import ru.ilin.weather.entity.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecastResponse {// Прогноз погоды


    private Coordinate coord; //географическое положение города

    private List<Weather> weather; //погода

    private String base; //станция

    private MainParametersForecast main;//главные параметры

    private String visibility;//видимость

    private Wind wind;//ветер

    private Clouds clouds;//облачность

    private Rain rain;//дождь

    private Snow snow;//снег

    private long dt;//время расчета данных ,unix,UTC

    private SystemParam sys;//системные параметры

    private long timezone;//Сдвиг в секундах от UTC

    private int id;// id города

    private String name;// название города

    private int cod;//Внутренний параметр(код города)

}
