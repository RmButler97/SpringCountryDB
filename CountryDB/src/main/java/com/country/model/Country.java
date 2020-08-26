package com.country.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Country {
	
	@Id						// marks field as primary key
	@GeneratedValue			// ObjectDB generates a unique primary key for every new entity object
	private int id;
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 50, message = "Country name should be between 3 and 50" )
	private String name;
	
	@NotNull
	@NotBlank
	@Size(min=5, max = 50, message = "Capital should be between 5 and 50" )
	private String capital;
	
	@NotNull
	private int population;
	
	@NotNull
	@NotBlank
	@Size(min=5, max = 100, message = "Landmark should be between 5 and 100" )
	private String landmark;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	
	@Override
	public String toString() {
		return "Country [Country Id: " +  id + ", Country name: " + name + 
				", Capial city" + capital + ", Population: " + population +
				", Landmark: " + landmark + "]";
	}
}
