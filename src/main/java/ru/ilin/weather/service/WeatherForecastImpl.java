package ru.ilin.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import ru.ilin.weather.entity.WeatherForecast;
import ru.ilin.weather.model.request.ByCityNameRequest;
import ru.ilin.weather.model.response.WeatherForecastResponse;
import ru.ilin.weather.repository.WeatherForecastRepository;

@Service
public class WeatherForecastImpl implements WeatherForecastService {

    private WeatherForecastRepository weatherForecastRepository;

    @Autowired
    public WeatherForecastImpl(WeatherForecastRepository weatherForecastRepository) {
        this.weatherForecastRepository = weatherForecastRepository;
    }

    @Override
    public void addWeatherForecast() {
        weatherForecastRepository.save(sendQueryAPI());
    }


    public WeatherForecast sendQueryAPI(){
            RestTemplate restTemplate = new RestTemplate();
        ByCityNameRequest byCityNameRequest = new ByCityNameRequest("Москва");
            String fooResourceUrl
                    = "http://api.openweathermap.org/data/2.5/weather?" +
                    "q="+byCityNameRequest.getCityName()+"&" +
                    "appid="+byCityNameRequest.getAppId()+"&" +
                    "lang="+byCityNameRequest.getLang()+"&" +
                    "units="+ byCityNameRequest.getUnits();

            WeatherForecastResponse weatherForecastResponse = restTemplate
                    .getForObject(fooResourceUrl,WeatherForecastResponse.class);
            WeatherForecast weatherForecast = new WeatherForecast
                    (weatherForecastResponse.getId(),
        weatherForecastResponse.getCoord(),
        weatherForecastResponse.getWeathers(),
        weatherForecastResponse.getBase(),
        weatherForecastResponse.getMain(),
        weatherForecastResponse.getVisibility(),
        weatherForecastResponse.getWind(),
        weatherForecastResponse.getClouds(),
        weatherForecastResponse.getRain(),
        weatherForecastResponse.getSnow(),
        weatherForecastResponse.getTimeCalculationData(),
        weatherForecastResponse.getSys(),
        weatherForecastResponse.getTimezone(),
        weatherForecastResponse.getCityId(),
        weatherForecastResponse.getNameCity(),
        weatherForecastResponse.getCodeCity());
        return weatherForecast;
    }
}