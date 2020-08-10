package com.sezayir.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sezayir.feignclient.RoomClient;
import com.sezayir.model.Room;
import com.sezayir.model.RoomReservation;

@RestController
@RequestMapping("/feinroom")
public class FeignController {

	public final RoomClient client;

	public FeignController(RoomClient client) {
		super();
		this.client = client;
	}

	@GetMapping("/all")
	public List<RoomReservation> getRoomReservations() {
		List<Room> rooms = client.getAllRooms();
		List<RoomReservation> roomReservations = new ArrayList<RoomReservation>();
		rooms.forEach(room -> {
			RoomReservation roomReservation = new RoomReservation();
			roomReservation.setRoomNumber(room.getRoomNumber());
			roomReservation.setRoomName(room.getName());
			roomReservation.setRoomId(room.getId());
			roomReservations.add(roomReservation);

		});
		return roomReservations;
	}



}
