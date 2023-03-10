package com.spring.kafka.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.spring.kafka.payload.User;

@Service
public class JsonKafkaProducer {

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	
	public void sendMessage(User data) {
		Message<User> message = MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC, "rohit_json").build();
		
		kafkaTemplate.send(message);
	}
}
