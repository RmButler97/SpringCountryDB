package com.country.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.country.model.Country;

@RepositoryRestResource
public interface CountryRepository extends JpaRepository<Country, Integer> {
	List<Country> findAll();
	
	@Query("select c from Country c where c.name=?1")
	Country findByName(String name);
	
	@Query("select c from Country c where c.capital=?1")
	Country findByCapital(String cap);
	
	@Query("select c from Country c where c.id=?1")
	Country findById(int id);
	
	@Query("select c from Country c where c.landmark=?1")
	Country findByLandmark(String landmark);
}
