package com.frs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frs.model.Airport;

@Repository
public interface AirportDao extends JpaRepository<Airport, String> {

}
