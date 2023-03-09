package com.spring.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kafka.model.KafkaProducer;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

	@Autowired
	private KafkaProducer kafkaProducer;

	@GetMapping("/publish")
	public ResponseEntity<String> getAll(@RequestParam String message) {
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("message sent");
	}
}
