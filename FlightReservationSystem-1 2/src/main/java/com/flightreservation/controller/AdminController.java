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

import com.flightreservation.model.Bookflight;
import com.flightreservation.model.Flight;
import com.flightreservation.service.AdminService;
import com.flightreservation.service.BookflightService;



@Controller
@RequestMapping("/admin")
public class AdminController {
	
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private BookflightService service;
	
	@GetMapping("")
	public String showFlight() {
		return "addflight";
	}
	
	@GetMapping("/")
	private String home() {
		return "adminHome";
	}
	
	
	@PostMapping("/save")
	public String saveFlight(@ModelAttribute Flight flight) {
		adminService.saveFlight(flight);
		return "adminHome";
		
	}
	
	@GetMapping("/getAllFlights")
	public String getAllFlight(@RequestParam(value = "message",required = false)String message , Model model) {
		
		List<Flight> flight=adminService.getAllFlights();
		model.addAttribute("list",flight);
//		model.addAttribute("message",message);
		return "viewflight";
		
	}
	
	@GetMapping("/getBookflight")
	public String getAllBookflight(@RequestParam(value = "message",required = false)String message , Model model) {
		
		List<Bookflight> flight=service.getAllBookflight();
		model.addAttribute("list",flight);
//		model.addAttribute("message",message);
		return "viewbookflight";

}
	
	
	
	
	
	@GetMapping("/edit")
	public String getEditPage(Model model,RedirectAttributes attributes,@RequestParam int id) {
		String page = null;
		try {
			Flight flight = adminService.getFlightById(id);
			model.addAttribute("flight", flight);
			page="editFlight";
		}catch(Exception e) {
			e.printStackTrace();
			page="redirect:getAllFlights";
		}
		return page;
	}
	
	@PostMapping("/update")
	public String updateFlight(@ModelAttribute Flight flight,RedirectAttributes attributes) {
		adminService.updateFlight(flight);
		
		return "redirect:getAllFlights";
	}
	
    @GetMapping("/delete")
   public String deleteFlight(@RequestParam int id,RedirectAttributes attributes) {
    	try {
    		adminService.deleteFlightById(id);
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return "redirect:getAllFlights";
	
}
    

}
