package com.pacific.inventoryservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacific.inventoryservice.model.Room;
import com.pacific.inventoryservice.repository.HotelRepository;

@Service
public class InventoryService {
	@Autowired
	HotelRepository hotelRepo;

	public List<Room> getRoomsInHotel(String hotelId, String category) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean addRooms(String hotelId, List<Room> rooms) {
		//hotelRepo.saveAllAndFlush(rooms);
		return null;
	}

}
