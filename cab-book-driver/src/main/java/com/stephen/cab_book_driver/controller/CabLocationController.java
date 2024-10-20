package com.stephen.cab_book_driver.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stephen.cab_book_driver.service.CabLocationService;

@RestController
@RequestMapping("/location")
public class CabLocationController {
	@Autowired
	private CabLocationService cabLocationService;

	@PutMapping
	public ResponseEntity<?> updateLocation() throws InterruptedException {
		int range = 10;
		while (range > 0) {
			// Simulating driver location update
			String driverId = "driver_" + range;
			String latitude = String.valueOf(Math.random() * 90); // Random latitude between 0 and 90
			String longitude = String.valueOf(Math.random() * 180); // Random longitude between 0 and 180
			String status = "ACTIVE";

			// Send driver object to Kafka
			cabLocationService.updateLocation(driverId, latitude, longitude, status);

			Thread.sleep(1000); // Simulate delay between location updates
			range--;
		}
		return new ResponseEntity<>(Map.of("message", "Driver locations updated"), HttpStatus.OK);
	}

}
