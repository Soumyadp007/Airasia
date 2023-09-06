package com.flight_airasia.service;

import com.flight_airasia.dto.ReservationRequest;
import com.flight_airasia.entity.Reservation;

public interface ReservationService {
	Reservation bookFlight(ReservationRequest request);

}
