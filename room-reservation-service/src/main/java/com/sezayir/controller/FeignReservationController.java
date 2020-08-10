package com.sezayir.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;	
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sezayir.feignclient.ReservationClient;
import com.sezayir.model.Reservation;

@RestController
@RequestMapping("/feinreservation")
public class FeignReservationController {
	
	private final ReservationClient client;

	public FeignReservationController(ReservationClient client) {
		super();
		this.client = client;
	}

	@GetMapping("/all")
	public List<Reservation> getAllReservations() {
		return this.client.getAllReservations();
	}

	@GetMapping("/{id}")
	public Reservation getReservation(@PathVariable("id") long id) {
		return this.client.getReservation(id);
	}
	
}
