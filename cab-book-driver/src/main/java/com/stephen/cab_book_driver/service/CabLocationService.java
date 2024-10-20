package com.stephen.cab_book_driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stephen.cab_book_driver.Driver;
import com.stephen.cab_book_driver.constant.KafkaConstant;

@Service
public class CabLocationService {
	 @Autowired
	    private KafkaTemplate<String, Object> kafkaTemplate;

	    public boolean updateLocation(String driverId, String latitude, String longitude, String status) {
	        // Create Driver object
	        Driver driver = new Driver(driverId, latitude, longitude, status);

	        // Send driver object to Kafka
	        kafkaTemplate.send(KafkaConstant.CAB_LOCATION, driver);
	        System.out.println("Driver location sent to Kafka: " + driver);
	        
	        return true;
	    }

}
