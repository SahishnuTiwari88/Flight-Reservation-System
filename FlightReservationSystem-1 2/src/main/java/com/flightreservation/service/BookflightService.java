package com.flightreservation.service;

import java.util.List;

import com.flightreservation.model.Bookflight;

public interface BookflightService {
	
	public Bookflight saveBookflight(Bookflight bookflight);
	
	public List<Bookflight> getAllBookflight();
	
	//public Bookflight getBookflightById(int id);

}
