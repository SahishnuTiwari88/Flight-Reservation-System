package com.flightreservation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightreservation.model.Bookflight;
import com.flightreservation.repository.Bookflightrepository;

@Service
public class BookflightServiceImpl implements BookflightService{
	@Autowired
	private Bookflightrepository brepo;

	@Override
	public Bookflight saveBookflight(Bookflight bookflight) {
		// TODO Auto-generated method stub
		return brepo.save(bookflight);
	}

	@Override
	public List<Bookflight> getAllBookflight() {
		// TODO Auto-generated method stub
		return brepo.findAll();
	}

	

//	@Override
//	public Bookflight getBookflightById(int id) {
//		// TODO Auto-generated method stub
//		Optional<Bookflight> opt = brepo.findById(id);
//		if(opt.isPresent()) {
//			return opt.get();
//		}else {
//			
//		}
//		return null;
//	}
	

}
