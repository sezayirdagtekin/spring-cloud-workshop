package com.sezayir.dao;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sezayir.model.Reservation;
import com.sezayir.repository.ReservationRepository;

@Component
public class ReservationDao {

	@Autowired
	ReservationRepository repository;

	public Optional<Reservation> findById(long id) {

		return repository.findById(id);
	}

	public Iterable<Reservation> getAllReservations() {
		return repository.findAll();
	}

}
