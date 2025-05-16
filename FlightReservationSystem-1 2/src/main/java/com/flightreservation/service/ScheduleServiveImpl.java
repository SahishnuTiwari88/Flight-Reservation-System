package com.flightreservation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightreservation.model.Schedule;
import com.flightreservation.repository.ScheduleRepository;
@Service
public class ScheduleServiveImpl implements ScheduleServive {
	@Autowired
	ScheduleRepository repo;
	
	@Override
	public Schedule saveSchedule(Schedule schedule) {
		return repo.save(schedule);
		
	}

	@Override
	public List<Schedule> getAllSchedules() {
		return repo.findAll();
	}

	@Override
	public void deleteScheduleById(int id) {
		// TODO Auto-generated method stub
//		repo.delete(getFlightById(id));
		repo.delete(getScheduleById(id));
		
	}

	@Override
	public Schedule getScheduleById(int id) {
		
		Optional<Schedule> opt=repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			
		}
		return null;
	}

	@Override
	public void updateSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		repo.save(schedule);
		
	}
	

}
