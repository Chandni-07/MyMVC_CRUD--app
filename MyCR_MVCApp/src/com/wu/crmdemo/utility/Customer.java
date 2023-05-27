package com.wu.crmdemo.utility;

public class Customer {
	
	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
	String firstname;
	String lastname;
	String email;
	public Customer() {
		
	}
	public Customer(String firstname, String lastname, String email) {
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
