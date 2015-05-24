package world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import world.entity.City;
import world.entity.Country;
import world.repository.CityRepository;
import world.repository.CountryRepository;

@Controller
public class ApiController {
	
	@Autowired
	CountryRepository countryRepository;
	
	@Autowired
	CityRepository cityRepository;
	
	@RequestMapping(value="/api/getAllCountries", method=RequestMethod.GET)
	@ResponseBody
	List<Country> getAllCountries() {		
		return countryRepository.findAll();
	}
	
	@RequestMapping(value="/api/getCitiesByCountryCode/{countryCode}", method=RequestMethod.GET)
	@ResponseBody
	List<City> getCitiesInCountry(@PathVariable String countryCode) {
		return cityRepository.findCityByCountryCode(countryCode);
	}
}
