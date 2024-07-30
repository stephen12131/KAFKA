package com.stephen.cab_book_driver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.stephen.cab_book_driver.constant.KafkaConstant;

@Configuration
public class KafkaConfig {


    @Bean
    NewTopic topic() {
		
		return TopicBuilder.name(KafkaConstant.CAB_LOCATION).build();
	}
}
