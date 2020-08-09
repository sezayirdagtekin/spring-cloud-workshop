package com.sezayir.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sezayir.model.Room;
import com.sezayir.repository.RoomRepository;

@Component
public class RoomDao {
	@Autowired
	private RoomRepository repository;

	public Iterable<Room> getAllRooms() {
		return repository.findAll();
	}

	public Optional<Room> findById(long id) {

		return repository.findById(id);
	}

}
