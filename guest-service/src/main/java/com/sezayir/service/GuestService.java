package com.sezayir.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sezayir.dao.GuestDao;
import com.sezayir.model.Guest;
	
@Service
public class GuestService {
	
@Autowired	
private GuestDao dao;

public  Iterable<Guest> getAllGuests() {

	return dao.getAllGuests();
}

public Optional<Guest> getById(Long id) {
	
	return dao.getById(id);
}	

}
