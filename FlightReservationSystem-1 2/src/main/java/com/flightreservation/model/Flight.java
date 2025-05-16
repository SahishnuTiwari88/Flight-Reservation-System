package com.flightreservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String fname;
     private int fcapacity;//first class
     private int bcapacity;//business class
     private int ecapacity;//economy
     private int ffair;//first class fair
     private int bfair;//business fair
     private int efair;//economy
     private int frescapacity;//first class reservation capacity
     private int brescapacity;// business class reservation capacity
     private int erescapacity;// economy class reservation capacity
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int id, String fname, int fcapacity, int bcapacity, int ecapacity, int ffair, int bfair, int efair,
			int frescapacity, int brescapacity, int erescapacity) {
		super();
		this.id = id;
		this.fname = fname;
		this.fcapacity = fcapacity;
		this.bcapacity = bcapacity;
		this.ecapacity = ecapacity;
		this.ffair = ffair;
		this.bfair = bfair;
		this.efair = efair;
		this.frescapacity = frescapacity;
		this.brescapacity = brescapacity;
		this.erescapacity = erescapacity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getFcapacity() {
		return fcapacity;
	}
	public void setFcapacity(int fcapacity) {
		this.fcapacity = fcapacity;
	}
	public int getBcapacity() {
		return bcapacity;
	}
	public void setBcapacity(int bcapacity) {
		this.bcapacity = bcapacity;
	}
	public int getEcapacity() {
		return ecapacity;
	}
	public void setEcapacity(int ecapacity) {
		this.ecapacity = ecapacity;
	}
	public int getFfair() {
		return ffair;
	}
	public void setFfair(int ffair) {
		this.ffair = ffair;
	}
	public int getBfair() {
		return bfair;
	}
	public void setBfair(int bfair) {
		this.bfair = bfair;
	}
	public int getEfair() {
		return efair;
	}
	public void setEfair(int efair) {
		this.efair = efair;
	}
	public int getFrescapacity() {
		return frescapacity;
	}
	public void setFrescapacity(int frescapacity) {
		this.frescapacity = frescapacity;
	}
	public int getBrescapacity() {
		return brescapacity;
	}
	public void setBrescapacity(int brescapacity) {
		this.brescapacity = brescapacity;
	}
	public int getErescapacity() {
		return erescapacity;
	}
	public void setErescapacity(int erescapacity) {
		this.erescapacity = erescapacity;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", fname=" + fname + ", fcapacity=" + fcapacity + ", bcapacity=" + bcapacity
				+ ", ecapacity=" + ecapacity + ", ffair=" + ffair + ", bfair=" + bfair + ", efair=" + efair
				+ ", frescapacity=" + frescapacity + ", brescapacity=" + brescapacity + ", erescapacity=" + erescapacity
				+ "]";
	}
     
     
     
     
}
