package com.capgemini.cab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capgemini.cab.entity.BookRide;
import com.capgemini.cab.entity.Distance;
import com.capgemini.cab.entity.Driver;
import com.capgemini.cab.entity.DriverDetails;
import com.capgemini.cab.entity.User;
import com.capgemini.cab.service.UserService;

import ch.qos.logback.core.status.Status;

@RestController
@CrossOrigin("*")
public class UserController {
	private String userName;

	@Autowired
	private UserService service;
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/signUp")
	public ResponseEntity<User> signUpDetailsOfUser(@RequestBody User user) {
		System.out.println(user);
		User status = service.addDetails(user);

		return new ResponseEntity<User>(status, HttpStatus.CREATED);

	}

	@GetMapping("/loginuser/{email}/{password}")
	public ResponseEntity<User> logInDetailsForUser(@PathVariable String email, @PathVariable String password) {
		// System.out.println(email);
		// System.out.println(password);

		User user1 = service.findByEmail(email);
		// System.out.println(user1);

		if (user1 == null) {
			return new ResponseEntity<User>(user1, HttpStatus.NOT_FOUND);
		}

		if (email.equals("admin@gmail.com") && password.equals("Admin@123")) {
			Admin admin = new Admin();
			Admin admin = restTemplate.getForEntity("http://ADMIN-SIGNIN/login", Admin.class).getBody();
		
			return ResponseEntity<Admin>(HttpStatus.FOUND);
		}

		userName = user1.getEmail();
		System.out.println(userName);

		if ((user1.getEmail().equals(email) && (user1.getPassword().equals(password)))) {

			return new ResponseEntity<User>(user1, HttpStatus.ACCEPTED);
		}

		return new ResponseEntity<User>(HttpStatus.UNAUTHORIZED);

	}

	@GetMapping("/bookride/{pickUpAt}/{dropAt}")
	public ResponseEntity<Distance> bookRideForUser(@PathVariable String pickUpAt, @PathVariable String dropAt) {
		System.out.println(pickUpAt);

		Distance distance = restTemplate
				.getForEntity("http://USER-COORDINATE-DISTANCE/distancecalculator/" + pickUpAt + "/" + dropAt,
						Distance.class)
				.getBody();

		System.out.println(distance.getFinalDistance());
		System.out.println(distance);
		return new ResponseEntity<Distance>(distance, HttpStatus.ACCEPTED);

	}

	@GetMapping("/confirmbooking")
	public ResponseEntity<DriverDetails> confirmDriver() {
		DriverDetails driverDetails = restTemplate
				.getForEntity("http://DRIVER-SIGNUP-SIGNIN/driverdetails", DriverDetails.class).getBody();
		System.out.println(driverDetails.getDriverDetails());
		return new ResponseEntity<DriverDetails>(driverDetails, HttpStatus.OK);

	}

	@GetMapping("/userdetailsfordriver")
	public ResponseEntity<User> userDetailsForDriver() {
		User user = new User();
		System.out.println(userName);
		user.setUsername(userName);
		System.out.println(user.getUsername());
		return new ResponseEntity<User>(user, HttpStatus.FOUND);

	}

}
