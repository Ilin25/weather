package ru.ilin.weather.model.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RainResponse {//дождь

    private int theOneHour;//TODO//объём дождя за последний один час
    private int forThreeHours;//TODO//объём дождя за последние три часа

}
