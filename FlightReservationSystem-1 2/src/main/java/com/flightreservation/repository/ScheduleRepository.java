package com.flightreservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.model.Schedule;



public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
	List<Schedule> findByScdateAndSourceAndDestination(String scdate,String Source, String destination);

}
