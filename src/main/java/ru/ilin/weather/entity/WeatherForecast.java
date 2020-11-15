package ru.ilin.weather.entity;


import com.fasterxml.jackson.core.JsonProcessingException;


import java.util.List;

public class WeatherForecast {// Прогноз погоды
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
    private int timezone;//Сдвиг в секундах от UTC
    private long id;// id города
    private String name;// название города
    private int code;//Внутренний параметр

    public static void main(String[] args) throws JsonProcessingException {

    }





}
