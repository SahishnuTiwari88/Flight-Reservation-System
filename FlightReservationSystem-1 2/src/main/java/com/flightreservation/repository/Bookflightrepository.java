package com.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.model.Bookflight;

public interface Bookflightrepository extends JpaRepository<Bookflight, Integer> {

}
