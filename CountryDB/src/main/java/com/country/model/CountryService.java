package com.country.model;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.country.repository.CountryRepository;

@Service
public class CountryService {
@Autowired
CountryRepository cr;

	public Country createCountry(Country c) {
		return cr.save(c);
	}
	public List<Country> getCountries() {
		return cr.findAll();
	}
	public Country findByName(String name) {
		return cr.findByName(name);
	}
	public Country findByCapital(String capital) {
		return cr.findByCapital(capital);
	}
	public Country findById(int id) {
		return cr.findById(id);
	}
	public Country findByLandmark(String landmark) {
		return cr.findByLandmark(landmark);
	}
}