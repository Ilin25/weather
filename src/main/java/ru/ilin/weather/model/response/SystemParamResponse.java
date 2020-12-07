package ru.ilin.weather.model.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SystemParamResponse {//Системные параметры

    private int type;//Внутренний параметр
    @JsonSetter("id")
    private long sys_id;//Внутренний параметр
    private String message;//Внутренний параметр
    private String country;//Код страны
    private long sunrise;//Время восхда,unix,UTC
    private long sunset;//Время заката ,unix,UTC

}
