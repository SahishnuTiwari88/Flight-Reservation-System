package com.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.model.UserDtls;

//import com.flightreservation.model.Login;

public interface LoginRepository extends JpaRepository<UserDtls,Integer> {
	
	//public UserDtls findByEmail(String email);
	public UserDtls findByEmailAndPassword(String email,String password);

}
