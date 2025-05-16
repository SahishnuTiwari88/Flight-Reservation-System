package com.frs.service;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.frs.model.Users;
import com.frs.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public Users createUseer(Users user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public boolean checkEmail(String userEmail) {
		// TODO Auto-generated method stub
		return userDao.existsByUserEmail(userEmail);
	}

	@Override
	public Users createUser(Users newUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users updateUser(Users newUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(BigInteger UserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Users> displayAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> findUserById(BigInteger userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

		

}