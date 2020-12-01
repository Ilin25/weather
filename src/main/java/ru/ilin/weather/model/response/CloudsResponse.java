package ru.ilin.weather.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CloudsResponse {//облачность
    private long id;
    private int cloudiness;// облачность в процентах

}
