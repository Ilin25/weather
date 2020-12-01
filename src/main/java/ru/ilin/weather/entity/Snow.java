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
@Table(name = "snow")
//название класса и полей полностью совпалдает с названиями в БД
public class Snow {//снег
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "theOneHour")
    private int theOneHour;//объём снега за последний один час
    @Column(name = "forThreeHours")
    private int forThreeHours;//объём снега за последние три часа

}
