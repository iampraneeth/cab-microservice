package com.capgemini.cab.adminsigninservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capgemini.cab.adminsigninservice.entity.Driver;
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

	@GetMapping("/pass/{email}")
	public ResponseEntity<Driver> passOfDriver(@PathVariable String email) {
		Driver d = restTemplate.getForEntity("http://DRIVER-SIGNUP-SIGNIN/pass/" + email, Driver.class).getBody();
		/* d.setPass(1); */
		System.out.println(d);
		System.out.println(d.getPass());

		return new ResponseEntity<Driver>(d, HttpStatus.OK);

	}

	@GetMapping("/fail/{email}")
	public ResponseEntity<Driver> failOfDriver(@PathVariable String email) {
		System.out.println(email);
	 restTemplate.getForEntity("http://DRIVER-SIGNUP-SIGNIN/fail/" + email, Driver.class).getBody();

		

		return new ResponseEntity<Driver>(HttpStatus.OK);

	}

}
