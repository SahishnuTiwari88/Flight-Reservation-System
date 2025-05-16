package com.flightreservation.service;

import java.util.List;

import com.flightreservation.model.Flight;

public interface AdminService {
	
	public Flight saveFlight(Flight flight);
	public List<Flight> getAllFlights();
	public Flight getFlightById(int id);
	public void deleteFlightById(int id);
	public void updateFlight(Flight flight);
	
	

}
