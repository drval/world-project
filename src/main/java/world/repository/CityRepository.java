package world.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import world.entity.City;

@Repository("cityRepository")
public interface CityRepository extends JpaRepository<City, Integer> {
	
	public List<City> findCityByCountryCode(String countryCode);
}
