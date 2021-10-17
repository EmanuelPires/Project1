package com.models;

public class Employees {
	
	
	
	
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String userRole;
	private String username;
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Employees [password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", userRole=" + userRole + ", username=" + username + "]";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	

	
	
}
