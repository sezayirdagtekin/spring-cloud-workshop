package com.sezayir.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sezayir.model.Reservation;

@Repository
public interface ReservationRepository  extends CrudRepository<Reservation, Long>{

}
