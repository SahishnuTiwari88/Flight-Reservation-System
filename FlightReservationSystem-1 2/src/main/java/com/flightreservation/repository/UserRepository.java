package com.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {
	//we have created repository so now we can use save,update,delete method from repository on the data
	public boolean existsByEmail(String email);
	
	//public UserDtls findByEmail(String em);
	

}