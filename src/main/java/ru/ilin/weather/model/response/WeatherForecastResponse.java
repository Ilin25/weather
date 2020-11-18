package ru.ilin.weather.model.response;


public class WeatherForecastResponse {// Прогноз погоды

    private long id;
    private CoordinateResponse coord; //географическое положение города
    private String base; //станция
    private MainParametersForecastResponse main;//главные параметры
    private String visibility;//видимость
    private WindResponse windResponse;//ветер
    private CloudsResponse cloudsResponse;//облачность
    private RainResponse rainResponse;//дождь
    private SnowResponse snowResponse;//снег
    private long timeCalculationData;//время расчета данных ,unix,UTC
    private SystemParamResponse sys;//системные параметры
    private long timezone;//Сдвиг в секундах от UTC
    private int cityId;// id города
    private String nameCity;// название города
    private int codeCity;//Внутренний параметр(код города)

}
