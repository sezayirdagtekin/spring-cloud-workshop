package com.sezayir.controller;

import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sezayir.feignclient.GuestClient;
import com.sezayir.model.Guest;

@RestController
@RequestMapping("feinguest")
public class FeignGuestController {

	public final GuestClient client;

	public FeignGuestController(GuestClient client) {
		super();
		this.client = client;
	}

	@GetMapping("/all")
	public Iterable<Guest> getAllGuests() {

		return client.getAllGuests();

	}

	@GetMapping("/{id}")
	public Guest getGuest(@PathVariable("id") Long id) {

		return client.getById(id);
	}

}
