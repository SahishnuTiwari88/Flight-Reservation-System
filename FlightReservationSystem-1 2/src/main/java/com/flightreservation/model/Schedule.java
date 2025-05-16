package com.flightreservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Schedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String flightname;
	private String flightcapacity;
	private String price;
	private String source;
	private String destination;
	private String scdate;
	private String timetaken;
	private String Distance;
	private int seatno;
	private String seattype;
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Schedule(int id, String flightname, String flightcapacity, String price, String source, String destination,
			String scdate, String timetaken) {
		super();
		this.id = id;
		this.flightname = flightname;
		this.flightcapacity = flightcapacity;
		this.price = price;
		this.source = source;
		this.destination = destination;
		this.scdate = scdate;
		this.timetaken = timetaken;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getFlightcapacity() {
		return flightcapacity;
	}
	public void setFlightcapacity(String flightcapacity) {
		this.flightcapacity = flightcapacity;
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
	public String getScdate() {
		return scdate;
	}
	public void setScdate(String datetime) {
		this.scdate = datetime;
	}
	public String getTimetaken() {
		return timetaken;
	}
	public void setTimetaken(String timetaken) {
		this.timetaken = timetaken;
	}
	public String getDistance() {
		return Distance;
	}
	public void setDistance(String distance) {
		Distance = distance;
	}
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	public String getSeattype() {
		return seattype;
	}
	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}
	@Override
	public String toString() {
		return "Schedule [id=" + id + ", flightname=" + flightname + ", flightcapacity=" + flightcapacity + ", price="
				+ price + ", source=" + source + ", destination=" + destination + ", datetime=" + scdate
				+ ", timetaken=" + timetaken + ", Distance=" + Distance + ", seatno=" + seatno + ", seattype="
				+ seattype + "]";
	}
	
	
	
	

}
