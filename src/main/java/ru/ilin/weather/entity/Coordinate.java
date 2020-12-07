package ru.ilin.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "coordinate")
public class Coordinate {//Координаты

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "lon")
    private double lon;//долгота

    @Column(name = "lat")
    private double lat;//широта

}
