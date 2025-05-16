package com.frs.repository;
import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frs.model.Users;;
@Repository
public interface UserDao extends JpaRepository<Users, BigInteger>{

	public boolean existsByUserEmail(String userEmail);

}