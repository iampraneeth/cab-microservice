package com.capgemini.cab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.cab.entity.BookRide;
import com.capgemini.cab.entity.Distance;

@RestController
public class DistanceController {
	@GetMapping("distancecalculator/{pickUpAt}/{dropAt}")
	public ResponseEntity<Distance> getDistance(@PathVariable String pickUpAt, @PathVariable String dropAt) {

		BookRide b = new BookRide();

		b.setDropAt("pune");
		b.setPickUpAt("mumbai");

		if (b.getDropAt().equals(dropAt) && b.getPickUpAt().equals(pickUpAt)) {
			Distance dist = new Distance(19.0760, 72.8777, 18.5204, 73.8567);
			double lon1 = Math.toRadians(dist.getLong1());
			double lon2 = Math.toRadians(dist.getLong2());
			double lat1 = Math.toRadians(dist.getLat1());
			double lat2 = Math.toRadians(dist.getLat2());

			double dlon = lon2 - lon1;
			double dlat = lat2 - lat1;

			double a = Math.pow(Math.sin(dlat / 2), 2)
					+ Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dlon / 2), 2);

			double c = 2 * Math.asin(Math.sqrt(a));

			double r = 6371;

			int finalDistance = (int) (c * r + 10);
			dist.setFinalDistance(finalDistance);

			return new ResponseEntity<Distance>(dist, HttpStatus.OK);
		}

		return new ResponseEntity<Distance>(HttpStatus.NOT_ACCEPTABLE);

	}
}