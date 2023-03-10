package com.spring.kafka.model;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	@KafkaListener(topics = "rohit",groupId = "myGroup")
	public void consume(String message) {
		System.out.println(message);
	}
}
