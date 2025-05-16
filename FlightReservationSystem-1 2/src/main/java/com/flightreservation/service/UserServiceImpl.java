package com.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightreservation.model.UserDtls;
import com.flightreservation.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService {
	//here we have to use repository(user repository) to save,store data b/c without it we cann't save/store data
	@Autowired //it will create internal object
	private UserRepository userRepo;
	

	@Override
	public UserDtls createUser(UserDtls user) {
		// TODO Auto-generated method stub
		
		
		return userRepo.save(user);
	}


	@Override
	public boolean checkEmail(String userEmail) {
		// TODO Auto-generated method stub
		return userRepo.existsByEmail(userEmail);
	}

}
