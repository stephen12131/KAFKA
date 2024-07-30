package com.stephen.cab_book_driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stephen.cab_book_driver.constant.KafkaConstant;

@Service
public class CabLocationService {
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public boolean updateLocation(String location) {
		//we set the events into our topic
		kafkaTemplate.send(KafkaConstant.CAB_LOCATION,location);
		
		return true;
	}

}
