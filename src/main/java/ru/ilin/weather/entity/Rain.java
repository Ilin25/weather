package ru.ilin.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rain {//дождь
    @Id
    private long id;
    private int theOneHour;//объём дождя за последний один час
    private int forThreeHours;//объём дождя за последние три часа
    @OneToOne
    private WeatherForecast weatherForecast;
}
