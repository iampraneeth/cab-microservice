package com.capgemini.cab.projectcabeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ProjectCabEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectCabEurekaApplication.class, args);
	}

}
