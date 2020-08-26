package com.country.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CountrySender {
	@Autowired
	CountryProducer producer;
	@Value("${country.amqp.queue}")
	String destination;
	public void sendCountries() {
		Country c = new Country();
		// id set automatically, starting at 1, using @GeneratedValue in Country.java
		c.setName("USA");
		c.setCapital("Washington DC");
		c.setPopulation(328200000);
		c.setLandmark("Statue of Liberty");
		producer.sendTo(destination, c);
	}
}
