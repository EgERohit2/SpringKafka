package com.spring.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kafka.model.JsonKafkaProducer;
import com.spring.kafka.payload.User;

@RestController
@RequestMapping("/api/kafka")
public class JsonMessageController {

	@Autowired
	private JsonKafkaProducer jsonKafkaProducer;
	
	@PostMapping("/post")
	public ResponseEntity<String> post(@RequestBody User user){
		jsonKafkaProducer.sendMessage(user);
		return ResponseEntity.ok("message sent to topic");
	}
}
