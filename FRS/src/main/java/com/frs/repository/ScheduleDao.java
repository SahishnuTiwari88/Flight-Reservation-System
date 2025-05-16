package com.frs.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frs.model.Schedule;

@Repository
public interface ScheduleDao extends JpaRepository<Schedule, BigInteger> {

}
