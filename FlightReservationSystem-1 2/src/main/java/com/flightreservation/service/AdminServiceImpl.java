package com.flightreservation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightreservation.model.Flight;
import com.flightreservation.repository.Adminrepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	Adminrepository repo;

	@Override
	public Flight saveFlight(Flight flight) {
		return repo.save(flight);
		
	}

	@Override
	public List<Flight> getAllFlights() {
		return repo.findAll();
	}

	@Override
	public void deleteFlightById(int id) {
		// TODO Auto-generated method stub
//		repo.delete(getFlightById(id));
		repo.delete(getFlightById(id));
		
	}

	@Override
	public Flight getFlightById(int id) {
		
		Optional<Flight> opt=repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			
		}
		return null;
	}

	@Override
	public void updateFlight(Flight flight) {
		// TODO Auto-generated method stub
		repo.save(flight);
		
	}
	
	

}
