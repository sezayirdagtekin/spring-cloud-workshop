package com.sezayir.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sezayir.model.Room;
import com.sezayir.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {

	@Autowired
	private RoomService service;

	@GetMapping("/all")
	public Iterable<Room> getAllRooms() {
		return this.service.getAllRooms();
	}

	@GetMapping("/{id}")
	public Optional<Room> getRoom(@PathVariable("id") Long id) {
		return this.service.findById(id);
	}

}
