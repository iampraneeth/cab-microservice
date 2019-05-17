package com.capgemini.cab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@Column(name = "U_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long U_id;
	private String username;
	private String password;
	private long number;
	private String email;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, long number, String email) {
		super();
		this.username = username;
		this.password = password;
		this.number = number;
		this.email = email;
	}

	public Long getU_id() {
		return U_id;
	}

	public void setU_id(Long u_id) {
		U_id = u_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", number=" + number + ", email=" + email
				+ "]";
	}

}