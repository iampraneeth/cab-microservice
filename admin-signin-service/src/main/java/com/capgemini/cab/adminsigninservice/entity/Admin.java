package com.capgemini.cab.adminsigninservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Admin {
	
	@Id
	@Column(name = "Admin_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Admin_Id;
	
	private String email;
	private String password;
	
	public Admin() {
		super();
	
	}

	public Admin(Long admin_Id, String email, String password) {
		super();
		Admin_Id = admin_Id;
		this.email = email;
		this.password = password;
	}

	public Long getAdmin_Id() {
		return Admin_Id;
	}

	public void setAdmin_Id(Long admin_Id) {
		Admin_Id = admin_Id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [Admin_Id=" + Admin_Id + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
}
