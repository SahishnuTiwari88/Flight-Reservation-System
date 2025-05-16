package com.flightreservation.service;

import com.flightreservation.model.UserDtls;

public interface UserService {
public UserDtls createUser(UserDtls user);
	
	public boolean checkEmail(String email);


}
