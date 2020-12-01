package ru.ilin.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.ilin.weather.entity.WeatherForecast;

public interface WeatherForecastRepository extends JpaRepository<WeatherForecast,Long> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO weather_forecast(base,visibility," +
            "time_calculation_data,time_zone,city_id,name_city,code_city," +
            "clouds_id,coordinate_id,main_parameters_forecast_id,rain_id," +
            "snow_id,system_param_id,wind_id)" +
            "VALUES (:base,:visibility,:timeCalculationData," +
            ":timezone,:cityId,:nameCity,:codeCity,:cloudsId," +
            ":coordinateId,:mainParametersForecastId,:rainId," +
            ":snowId,:systemParamId,:windId)",nativeQuery = true)

    void addWeatherForecast(@Param("base") String base,
                      @Param("visibility") String visibility,
                      @Param("timeCalculationData") long timeCalculationData,
                      @Param("timezone") long timezone,
                      @Param("cityId") int cityId,
                      @Param("nameCity") String nameCity,
                      @Param("codeCity") int codeCity,
                      @Param("cloudsId") long cloudsId,
                         @Param("coordinate") long coordinate,
                      @Param("mainParametersForecastId") long mainParametersForecastId,
                      @Param("rainId") long rainId,
                      @Param("snowId") long snowId,
                      @Param("systemParamId") long systemParamId,
                      @Param("windId") long windId);
}
