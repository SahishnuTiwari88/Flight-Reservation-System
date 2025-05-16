package com.flightreservation.service;

import java.util.List;


import com.flightreservation.model.Schedule;

public interface ScheduleServive {
	
	public Schedule saveSchedule(Schedule schedule);
	public List<Schedule> getAllSchedules();
	public Schedule getScheduleById(int id);
	public void deleteScheduleById(int id);
	public void updateSchedule(Schedule schedule);

}
