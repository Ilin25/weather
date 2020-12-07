package ru.ilin.weather.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
public class WeatherForecastResponse {// Прогноз погоды

    private CoordinateResponse coord; //географическое положение города

    private List<WeatherResponse> weather; //погода

    private String base; //станция

    private MainParametersForecastResponse main;//главные параметры

    private String visibility;//видимость

    private WindResponse wind;//ветер

    private CloudsResponse clouds;//облачность

    private RainResponse rain;//дождь

    private SnowResponse snow;//снег

    private long dt;//время расчета данных ,unix,UTC

    private SystemParamResponse sys;//системные параметры

    private long timezone;//Сдвиг в секундах от UTC
    @JsonSetter("id")
    private int cityId;// id города

    private String name;// название города

    private int cod;//Внутренний параметр(код города)


}
