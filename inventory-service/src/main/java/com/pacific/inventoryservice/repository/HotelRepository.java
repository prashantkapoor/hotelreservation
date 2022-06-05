package com.pacific.inventoryservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.pacific.inventoryservice.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
