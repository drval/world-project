package world.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import world.entity.Country;

@Repository("countryRepository")
public interface CountryRepository extends JpaRepository<Country, String> {

}
