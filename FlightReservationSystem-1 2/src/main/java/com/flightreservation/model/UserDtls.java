package com.flightreservation.model;

import jakarta.persistence.Column;

//import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.validation.constraints.Email;
//import lombok.Data;


//@Data// used for setting setter getter internally without declaring
@Entity
public class UserDtls {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// means id is auto generated and auto increment
	
	private int Id;
	private String name;
	private String dob;
	private String gender;
	private String address;
	private int number;
	
	
	@Column(nullable=false, unique=true)
	//@Email(message="{errors.invalid_email}")
	private String email;
	private String password;
	private String role="normal";
	public UserDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDtls(int id, String name, String dob, String gender, String address, int number, String email,String password,
			String role) {
		super();
		Id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.number = number;
		
		this.email = email;
		this.password=password;
		this.role = role;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDtls [Id=" + Id + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", address=" + address
				+ ", number=" + number + ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}
}
	
	