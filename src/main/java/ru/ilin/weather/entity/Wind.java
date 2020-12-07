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
@Table(name = "wind")

public class Wind {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long Id;
    @Column(name = "speed")
    private double speed;//скорость ветра
    @Column (name = "deg")
    private double deg;//направление ветра в градусах
    @Column(name = "gust")
    private double gust;//порывы ветра

}
