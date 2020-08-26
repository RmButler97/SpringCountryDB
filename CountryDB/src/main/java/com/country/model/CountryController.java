package com.country.model;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	@Autowired
	CountryService cs;
	
	@GetMapping("/Countries")
	List<Country> getCountries() {
		return cs.getCountries();
	}
	
	@GetMapping("/Countries/{name}")
	Country getCountryByName(@PathVariable String name) {
		return cs.findByName(name);
	}
	
	@GetMapping("/Capital/{capital}")
	Country getCountryByCapital(@PathVariable String capital) {
		return cs.findByCapital(capital);
	}
	
	@GetMapping("/Id/{id}")
	Country getCountryById(@PathVariable int id) {
		return cs.findById(id);
	}
	
	@GetMapping("/Landmark/{landmark}")
	Country getCountryByLandmark(@PathVariable String landmark) {
		return cs.findByLandmark(landmark);
	}
	
	@PostMapping("/Country")
	Country createCountry(@Valid @RequestBody Country c) {
		return cs.createCountry(c);
	}
}
