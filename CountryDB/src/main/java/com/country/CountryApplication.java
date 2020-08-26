package com.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.country.model.CountrySender;

@SpringBootApplication
public class CountryApplication implements CommandLineRunner{
	@Autowired
	CountrySender cs;
	
	public static void main(String[] args) {
		SpringApplication.run(CountryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cs.sendCountries();
	}
	
	
}
