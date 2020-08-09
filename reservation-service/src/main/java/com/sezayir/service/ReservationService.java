package com.sezayir.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sezayir.dao.ReservationDao;
import com.sezayir.model.Reservation;

@Service
public class ReservationService {

	@Autowired
	private ReservationDao dao;

	public Iterable<Reservation> getAllReservations() {
		return dao.getAllReservations();
	}

	public Optional<Reservation> findById(long id) {
		return dao.findById(id);
	}

}
