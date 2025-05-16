//package com.flightreservation.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
////import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//@Configuration
//public class SecurityConfig{
//	//@Bean
////	public UserDetailsService userDetailService() {
////		return null;
////		
////		
////		
////	}
//	
//	
//	
//	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
//	{
//		http
//		.csrf().disable()
//		.authorizeHttpRequests()
//		.requestMatchers("/login","/register","/createUser").permitAll()
//		.anyRequest()
//		.authenticated().and().formLogin();
//		//.loginPage("/login").usernameParameter("email").passwordParameter("password");
//		return http.build();}
//}