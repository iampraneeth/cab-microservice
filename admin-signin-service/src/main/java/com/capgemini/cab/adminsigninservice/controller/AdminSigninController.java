package com.capgemini.cab.adminsigninservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capgemini.cab.adminsigninservice.entity.DriverDetails;
import com.capgemini.cab.adminsigninservice.service.AdminService;

@RestController
@CrossOrigin("*")
public class AdminSigninController {
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private AdminService service;

	@GetMapping("/okdriver")
	public ResponseEntity<DriverDetails> okDriver() {

		DriverDetails details = restTemplate
				.getForEntity("http://DRIVER-SIGNUP-SIGNIN/driverdetails", DriverDetails.class).getBody();
		System.out.println(details);

		return new ResponseEntity<DriverDetails>(details, HttpStatus.OK);

	}

}
