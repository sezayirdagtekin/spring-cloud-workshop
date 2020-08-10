package com.sezayir.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sezayir.model.Reservation;

@FeignClient("reservationservices")
public interface ReservationClient {
	@GetMapping("/reservation/all")
	List<Reservation> getAllReservations();

	@GetMapping("/reservation/{id}")
	Reservation getReservation(@PathVariable("id") long id);
}