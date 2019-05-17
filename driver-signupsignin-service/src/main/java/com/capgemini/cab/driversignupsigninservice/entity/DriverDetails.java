package com.capgemini.cab.driversignupsigninservice.entity;

import java.util.List;

public class DriverDetails {
	private List<Driver> driverDetails;

	public DriverDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public DriverDetails(List<Driver> driverDetails) {
		super();
		this.driverDetails = driverDetails;
	}

	public List<Driver> getDriverDetails() {
		return driverDetails;
	}

	public void setDriverDetails(List<Driver> driverDetails) {
		this.driverDetails = driverDetails;
	}
	
	

}
