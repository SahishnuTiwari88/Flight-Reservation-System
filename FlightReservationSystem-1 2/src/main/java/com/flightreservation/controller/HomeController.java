package com.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import com.flightreservation.model.Login;
import com.flightreservation.model.UserDtls;
import com.flightreservation.repository.LoginRepository;
import com.flightreservation.service.UserService;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	@Autowired LoginRepository repo;

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/createUser")
	public String createuser(@ModelAttribute UserDtls user,HttpSession session) {

		 System.out.println(user);
		
		boolean f = userService.checkEmail(user.getEmail());
		if(f)
		{
			session.setAttribute("msg","");
			//System.out.println("Email Id Already Exists");
		}
		else
		{   
			user.setRole("normal");
			UserDtls userDtls = userService.createUser(user);
			
			if(userDtls != null) {
				session.setAttribute("msg", "Register Successfully");
				System.out.println("");
			}
			else {
				
				
				
					session.setAttribute("msg", "There is some error in server");
				}

			}  
		
			
		

		return "redirect:/register";
	}
	
	@RequestMapping(value="/doLogin")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response,HttpSession session,@ModelAttribute UserDtls user) {
			ModelAndView model = new ModelAndView();

		
		try {
			UserDtls userDetails = repo.findByEmailAndPassword(user.getEmail(),user.getPassword());
			model.addObject("user", userDetails);
			if(userDetails!=null) {
				if(userDetails.getRole().equals("admin")) {
					model.setViewName("adminHome");
					return model;
				}else {
					model.setViewName("searchFlight");
					return model;
				}
			}
			else {
				model.setViewName("login");
				return model;
			}
		}
		catch(Exception e) {
			
		}	

			model.setViewName("index");
			return model;
	}
	

	@RequestMapping("/doLogout")
	public String Logout(HttpSession session) {
		session.invalidate();
		return "index";
	}

}


