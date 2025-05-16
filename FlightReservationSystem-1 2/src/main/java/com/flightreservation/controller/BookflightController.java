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

import com.flightreservation.model.Bookflight;

import com.flightreservation.service.BookflightService;

@Controller
@RequestMapping("/book")
public class BookflightController {
	 @Autowired
	private BookflightService service;
	 
	
	 @PostMapping("/save")
		public String saveBookflight(@ModelAttribute Bookflight bflight) {
			service.saveBookflight(bflight);
			return "bookflight";
			
		}
	 
	 
}
