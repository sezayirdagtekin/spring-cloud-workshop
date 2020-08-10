package com.sezayir.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sezayir.model.Room;

//service in eureka
@FeignClient("roomservices") 
public interface RoomClient {
	@GetMapping("room/all")
	List<Room> getAllRooms();
	
	@GetMapping("/room/{id}")
	Room findById(@PathVariable("id")  long id);

}
