package com.flightreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.flightreservation.model.Schedule;
import com.flightreservation.service.ScheduleServive;

@Controller
@RequestMapping("/schdule")
public class ScheduleController {
	
	@Autowired
	private ScheduleServive service;
	
	@GetMapping("")
	public String showSchedule() {
		return "Scheduleflight";
	}
	
	@GetMapping("/")
	private String home() {
		return "adminHome";
	}
	
	
	@PostMapping("/save")
	public String saveSchedule(@ModelAttribute Schedule schedule) {
		service.saveSchedule(schedule);
		return "adminHome";
		
	}
	
	@GetMapping("/getAllSchedules")
	public String getAllSchedule(@RequestParam(value = "message",required = false)String message , Model model) {
		
		List<Schedule> schedule=service.getAllSchedules();
		model.addAttribute("list",schedule);
//		model.addAttribute("message",message);
		return "viewschedule";
		
	}
	@GetMapping("/edit")
	public String getEditPage(Model model,RedirectAttributes attributes,@RequestParam int id) {
		String page = null;
		try {
			Schedule schedule = service.getScheduleById(id);
			model.addAttribute("schedule", schedule);
			page="editSchedule";
		}catch(Exception e) {
			e.printStackTrace();
			page="redirect:getAllSchedules";
		}
		return page;
	}
	
	@PostMapping("/update")
	public String updateSchedule(@ModelAttribute Schedule schedule,RedirectAttributes attributes) {
		service.updateSchedule(schedule);
		
		return "redirect:getAllSchedules";
	}
	
    @GetMapping("/delete")
   public String deleteSchedule(@RequestParam int id,RedirectAttributes attributes) {
    	try {
    		service.deleteScheduleById(id);
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return "redirect:getAllSchedules";
	
}
    

}
