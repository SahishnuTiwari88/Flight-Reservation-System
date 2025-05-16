package com.frs.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frs.model.Booking;

@Repository
public interface BookingDao extends JpaRepository<Booking, BigInteger> {

}
