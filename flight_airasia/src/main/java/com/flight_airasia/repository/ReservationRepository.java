package com.flight_airasia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_airasia.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
