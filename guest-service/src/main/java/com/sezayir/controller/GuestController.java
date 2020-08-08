package com.sezayir.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sezayir.model.Guest;
import com.sezayir.service.GuestService;

@RestController
@RequestMapping("/guest")
public class GuestController {
	
@Autowired
private GuestService service;


@GetMapping("/all")
public  Iterable<Guest> getAllGuests(){
	
	return service.getAllGuests();
	
}

@GetMapping("/{id}")
public Optional<Guest> getGuest(@PathVariable("id") Long id) {
	
	return service.getById(id);
}

}
