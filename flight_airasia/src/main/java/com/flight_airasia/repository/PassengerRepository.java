package com.flight_airasia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_airasia.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
