package az.coders.cityservice.repository;

import az.coders.cityservice.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository <City,Long> {
    List<City> findByName(String name);
}
