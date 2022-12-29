package com.deewana.generale2e.model;

public class Account {

	int userId;
	String password;
	String name;
	String email;
	long phone;
	String gender;

	public Account(int userName, String password, String name, String email, long phone, String gender) {
		super();
		this.userId = userName;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
	}

	public Account(int userName, String password) {
		super();
		this.userId = userName;
		this.password = password;
	}

	public int getUserName() {
		return userId;
	}

	public void setUserName(int userName) {
		this.userId = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
