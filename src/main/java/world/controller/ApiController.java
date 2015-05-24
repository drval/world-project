package world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import world.entity.Country;
import world.repository.CountryRepository;

@Controller
public class ApiController {
	
	@Autowired
	CountryRepository countryRepository;
	
	@RequestMapping(value="/api/getAllCountries", method=RequestMethod.GET)
	@ResponseBody
	List<Country> getAllCountries() {
		System.out.println("in controller");
		return countryRepository.findAll();
	}
}
