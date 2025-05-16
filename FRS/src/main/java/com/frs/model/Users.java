package com.frs.model;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {
	//private String userType;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger userId;
	private String userName;
	private String dob;
	private String gender;
	private String address;
	private BigInteger number;
	private String userEmail;
	private String password;
	
	public Users(BigInteger userId, String userName, String dob, String gender, String address, BigInteger number,
			String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.number = number;
		this.userEmail = userEmail;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigInteger getNumber() {
		return number;
	}

	public void setNumber(BigInteger number) {
		this.number = number;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", dob=" + dob + ", gender=" + gender
				+ ", address=" + address + ", number=" + number + ", userEmail=" + userEmail + ", password=" + password
				+ "]";
	}
	
	

}

	