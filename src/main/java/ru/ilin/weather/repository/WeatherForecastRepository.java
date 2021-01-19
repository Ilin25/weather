package ru.ilin.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.ilin.weather.entity.WeatherForecast;

import java.util.List;

public interface WeatherForecastRepository extends JpaRepository<WeatherForecast,Long> {


    @Transactional
    @Query(value =
            "SELECT EXISTS (SELECT FROM weather_forecast WHERE time_calculation_data=:date)",
            nativeQuery = true)
    boolean filteringIdenticalDates(@Param("date") Long date);

    @Transactional
    @Query(value = "SELECT time_calculation_data FROM weather_forecast", nativeQuery = true)
    List<Long> getListDate();


    @Transactional
    @Query(value = "SELECT * FROM weather_forecast w WHERE w.time_calculation_data = :date",
            nativeQuery = true)
    WeatherForecast getWeatherForecast(@Param("date") Long date);
}
