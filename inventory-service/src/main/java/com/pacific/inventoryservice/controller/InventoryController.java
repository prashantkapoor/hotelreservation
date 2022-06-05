package com.pacific.inventoryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pacific.inventoryservice.model.Room;
import com.pacific.inventoryservice.service.InventoryService;

@RestController
@RequestMapping("/inventory/hotel")
public class InventoryController {
	
	@Autowired
	private InventoryService inventory;

	//get list of rooms by hotel id, of a specific category
	//get list of standard services attached to each room
	//admin privileges
	//update room 
	//add new room
	//delete room
	@GetMapping(value="/{hotelId}/rooms")
	public ResponseEntity<List<Room>> getRoomsInHotel(@PathVariable("hotelId") String hotelId,@RequestParam(required = false) String category){
		List<Room> availableRooms=inventory.getRoomsInHotel(hotelId,category);
		return new ResponseEntity<List<Room>>(availableRooms, HttpStatus.OK);
		
	}
	
	@PostMapping(value="/{hotelId}/rooms")
	public ResponseEntity<Boolean> addRooms(@PathVariable("hotelId") String hotelId,@RequestBody List<Room> rooms){
		Boolean roomsAdded=inventory.addRooms(hotelId,rooms);
		return new ResponseEntity<Boolean>(roomsAdded, HttpStatus.OK);
		
	}
}
