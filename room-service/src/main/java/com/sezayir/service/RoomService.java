package com.sezayir.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sezayir.dao.RoomDao;
import com.sezayir.model.Room;

@Service
public class RoomService {
	
	@Autowired
	private RoomDao dao;

	public Iterable<Room> getAllRooms() {
	
		return dao.getAllRooms();
	}

	public Optional<Room> findById(long id) {
		
		return  dao.findById(id);
	}

}
