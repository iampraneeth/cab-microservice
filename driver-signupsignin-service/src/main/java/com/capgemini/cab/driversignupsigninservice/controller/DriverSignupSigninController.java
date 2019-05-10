package com.capgemini.cab.driversignupsigninservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.cab.driversignupsigninservice.entity.Driver;
import com.capgemini.cab.driversignupsigninservice.service.DriverService;

@RestController
@CrossOrigin("*")
public class DriverSignupSigninController {

	@Autowired
	private DriverService service;

	@PostMapping("/registration")
	public ResponseEntity<Driver> registrationForDriver(@RequestBody Driver driver) {
		System.out.println(driver);
		Driver profile = service.addDetails(driver);
		System.out.println(profile);

		return new ResponseEntity<Driver>(profile, HttpStatus.CREATED);
	}

	@GetMapping("/login/{email}/{password}")
	public ResponseEntity<Driver> logInDetailsForUser(@PathVariable String email, @PathVariable String password)
			throws NullPointerException {

		Driver status = service.findByEmail(email);

		if ((status.getEmail().equals(email) && (status.getPassword().equals(password)))) {

			return new ResponseEntity<Driver>(status, HttpStatus.ACCEPTED);
		}

		return new ResponseEntity<Driver>(HttpStatus.NOT_FOUND);

	}

}
