package com.example.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name="contact")
@JsonSerialize
public class Contact {

	@Id
	private String phoneNumber;
	private String firstName;
	private String lastName;
	
	public Contact(){}

	public Contact(String phoneNumber, String firstName, String lastName) {
		super();
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
	    return "{" + "\"phoneNumber\" :\"" + phoneNumber + "\", \"firstName\" :\"" + firstName + "\"" + "\", \"lastName\" :\"" + lastName + "\"" + '}';
	}


}
