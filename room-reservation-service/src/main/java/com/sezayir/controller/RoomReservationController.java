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

import com.sezayir.model.Room;
import com.sezayir.model.RoomReservation;

@RestController
@RequestMapping("/room-reservation")
public class RoomReservationController {

	public final RestTemplate restTemplate;

	public RoomReservationController(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	@GetMapping("/all")
	public List<RoomReservation> getRoomReservations() {
		List<Room> rooms = getAllRooms();
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

	private List<Room> getAllRooms() {

		ResponseEntity<List<Room>> roomResponse = this.restTemplate.exchange("http://ROOMSERVICES/room/all",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
				});
		return roomResponse.getBody();
	}

}
