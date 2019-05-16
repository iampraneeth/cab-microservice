package com.capgemini.cab.driversignupsigninservice.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Driver {

	@Id
	@Column(name = "D_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long D_id;

	private String name;
	private String email;
	private long contact;
	private String gender;
	private LocalDate dateOfBirth;
	private String address;
	private String state;
	private String city;
	private int postalCode;
	private String licenseNumber;
	private String vehicleRegistrationNumber;
	private String policeReport;
	private String password;
	private int status;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Driver() {
		super();
		
	}

	public Driver(long d_id, String name, String email, long contact, String gender, LocalDate dateOfBirth,
			String address, String state, String city, int postalCode, String licenseNumber,
			String vehicleRegistrationNumber, String policeReport, String password) {
		super();
		D_id = d_id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.state = state;
		this.city = city;
		this.postalCode = postalCode;
		this.licenseNumber = licenseNumber;
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
		this.policeReport = policeReport;
		this.password = password;
	}

	public long getD_id() {
		return D_id;
	}

	public void setD_id(long d_id) {
		D_id = d_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getVehicleRegistrationNumber() {
		return vehicleRegistrationNumber;
	}

	public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}

	public String getPoliceReport() {
		return policeReport;
	}

	public void setPoliceReport(String policeReport) {
		this.policeReport = policeReport;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Driver [D_id=" + D_id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", state=" + state + ", city="
				+ city + ", postalCode=" + postalCode + ", licenseNumber=" + licenseNumber
				+ ", vehicleRegistrationNumber=" + vehicleRegistrationNumber + ", policeReport=" + policeReport
				+ ", password=" + password + "]";
	}

}
