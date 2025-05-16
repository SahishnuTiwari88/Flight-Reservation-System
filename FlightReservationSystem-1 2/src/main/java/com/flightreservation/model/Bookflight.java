package com.flightreservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bookflight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pname;
	private String fname;
	private String date;
	private String price;
	private String source;
	private String destination;
	private String seatno;
	//private String seattyp;
	public Bookflight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bookflight(int id, String pname, String fname, String date, String price, String source, String destination,
			String seatno) {
		super();
		this.id = id;
		this.pname = pname;
		this.fname = fname;
		this.date = date;
		this.price = price;
		this.source = source;
		this.destination = destination;
		this.seatno = seatno;
		//this.seattyp = seattyp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSeatno() {
		return seatno;
	}
	public void setSeatno(String seatno) {
		this.seatno = seatno;
	}
	
	@Override
	public String toString() {
		return "Bookflight [id=" + id + ", pname=" + pname + ", fname=" + fname + ", date=" + date + ", price=" + price
				+ ", source=" + source + ", destination=" + destination + ", seatno=" + seatno + "]";
	}
	
	
	

}
