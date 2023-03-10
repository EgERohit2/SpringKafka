package com.spring.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {

	@Bean
	public NewTopic rohitTopic() {
		return TopicBuilder.name("rohit").build();
	}
	
	@Bean
	public NewTopic rohitTopicnew() {
		return TopicBuilder.name("rohit_json").build();
	}
	
	
}
