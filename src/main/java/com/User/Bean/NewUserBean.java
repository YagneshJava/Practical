package com.User.Bean;

import java.io.Serializable;

public class NewUserBean implements Serializable{
	

	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String lastName;
	private String email;
	private String password;
	private String userName;
	private String dateOfBirth;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "UserBean [name=" + name + ", lastName=" + lastName + ", email=" + email + ", password=" + password
				+ ", userName=" + userName + ", dateOfBirth=" + dateOfBirth + "]";
	}
	


}
