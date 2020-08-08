package com.sezayir.repository;

import org.springframework.data.repository.CrudRepository;

import com.sezayir.model.Guest;

public interface GuestRepository extends CrudRepository<Guest, Long> {

}
