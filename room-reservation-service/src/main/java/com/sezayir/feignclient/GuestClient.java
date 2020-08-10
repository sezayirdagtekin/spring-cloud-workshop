package com.sezayir.feignclient;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sezayir.model.Guest;

@FeignClient("guestservices")
public interface GuestClient {

	@GetMapping("/guest/all")
	List<Guest> getAllGuests();

	@GetMapping("/guest/{id}")
	Guest getById(@PathVariable("id") Long id);
}