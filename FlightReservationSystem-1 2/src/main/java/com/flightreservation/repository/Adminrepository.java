package com.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.model.Flight;

public interface Adminrepository extends JpaRepository<Flight, Integer>{

}
