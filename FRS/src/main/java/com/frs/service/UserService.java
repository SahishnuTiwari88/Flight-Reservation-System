package com.frs.service;

import java.math.BigInteger;

import org.springframework.http.ResponseEntity;

import com.frs.model.Users;

public interface UserService {
	
	public Users createUseer(Users user);
	
	public boolean checkEmail(String userEmail);

	public Users createUser(Users newUser);

	public Users updateUser(Users newUser);

	public String deleteUser(BigInteger UserId);

	public Iterable<Users> displayAllUser();

	public ResponseEntity<?> findUserById(BigInteger userId);
}