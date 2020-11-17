package ru.ilin.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//название класса и полей полностью совпалдает с названиями в БД
@Table(name = "rain")
public class Rain {//дождь
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "theOneHour")
    private int theOneHour;//объём дождя за последний один час
    @Column(name = "forThreeHours")
    private int forThreeHours;//объём дождя за последние три часа
    @OneToOne
    private WeatherForecast weatherForecast;
}
