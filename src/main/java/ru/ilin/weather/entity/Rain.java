package ru.ilin.weather.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor

@Table(name = "rain")
public class Rain {//дождь
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "the_one_hour")
    private int theOneHour;//объём дождя за последний один час

    @Column(name = "for_three_hours")
    private int forThreeHours;//объём дождя за последние три часа

}
