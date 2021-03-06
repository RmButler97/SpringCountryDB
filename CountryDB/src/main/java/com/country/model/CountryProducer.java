package com.country.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class CountryProducer {
	private static final Logger log = LoggerFactory.getLogger(CountryProducer.class);
	private RabbitTemplate template;

	public CountryProducer(RabbitTemplate template) {
		this.template = template;
	}

	public void sendTo(String queue, Country c) {
		this.template.convertAndSend(queue, c);
		log.info("Producer> Message Sent");
	}
}
