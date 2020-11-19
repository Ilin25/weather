package ru.ilin.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.ilin.weather.entity.WeatherForecast;

public interface weatherForecastRepository extends JpaRepository<WeatherForecast,Integer> {

//    @Modifying
//    @Transactional
//    @Query(value =
//            "INSERT INTO weather_Forecast(" +
//                    "base,visibility,time_calculation_data," +
//            "timezone,city_id,name_city,code_city,clouds_id," +
//                    "coord_id,main_id,rain_id,snow_id,sys_id,wind_id) " +
//                    "VALUES (" +
//                    ":base,:visibility,:timeCalculationData," +
//                    ":timezone,:cityId,:nameCity,:codeCity)",
//            nativeQuery = true)
//    void weatherForecast(@Param("base") String base,
//                      @Param("visibility") String visibility,
//                      @Param("timeCalculationData") long timeCalculationData,
//                      @Param("timezone") long timezone,
//                      @Param("cityId") int cityId,
//                      @Param("nameCity") int nameCity,
//                      @Param("codeCity") int codeCity);
}
