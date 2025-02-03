package com.example.JDBC.Entity;

import org.springframework.beans.factory.annotation.Autowired;

public class USER {
	private String Name;
	
	private String email;
	
	private String gender;
	
	private String city;
	

	public USER (String Name,String email,String gender,String city) {
		this.Name = Name;
		this.email = email;
		this.gender = gender;
		this.city = city;
	}
	
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
