package com.stephen.cab_book_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	//we listen topics from  cacb-location
	@KafkaListener(topics="cacb-location",groupId="user-group")
	public void cabLocation(String location) {
		System.out.println(location);
		
	}

}
