package com.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.flightreservation.model.Schedule;
import com.flightreservation.service.ScheduleService;





@Controller
@RequestMapping("/sch")
public class ScheduleControler {
	
	@Autowired
	private ScheduleService service;
	

	
	@RequestMapping("/search")
	public ModelAndView searchFlight(){
		ModelAndView model = new ModelAndView();
		// model.addObject("list", schdule);
		model.setViewName("searchFlight");
	return model;
	} 
			
	
	@RequestMapping("/sch")
    public ModelAndView getentities( @ModelAttribute Schedule schedule){
	ModelAndView model= new ModelAndView();
	System.out.println(service.findByFields(schedule.getScdate(),schedule.getSource(), schedule.getDestination()).size());
	model.addObject("list",service.findByFields(schedule.getScdate(),schedule.getSource(), schedule.getDestination()));
	model.setViewName("viewflightschedule");
		return model;
}
	@RequestMapping("")
	public String bookFlight() {
		return "BookFlight";
	}
}

