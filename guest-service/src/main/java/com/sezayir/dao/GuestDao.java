package com.sezayir.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sezayir.model.Guest;
import com.sezayir.repository.GuestRepository;

@Component
public class GuestDao {

	@Autowired
	private GuestRepository repository;

	public Iterable<Guest> getAllGuests() {

		return repository.findAll();
	}

	public Optional<Guest> getById(Long id) {

		return repository.findById(id);
	}

}
