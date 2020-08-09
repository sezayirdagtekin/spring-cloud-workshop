package com.sezayir.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sezayir.model.Reservation;
import com.sezayir.service.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	private ReservationService service;

	@GetMapping("/all")
	public Iterable<Reservation> getAllReservations() {
		return this.service.getAllReservations();
	}

	@GetMapping("/{id}")
	public Optional<Reservation> getReservation(@PathVariable("id") long id) {
		return this.service.findById(id);
	}
}
