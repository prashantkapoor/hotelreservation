package com.pacific.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pacific.userservice.model.Guest;
import com.pacific.userservice.model.User;
import com.pacific.userservice.service.UserService;

@RestController("/user-service")
public class UserController{
	
	@Autowired
	UserService userService;

	@PostMapping("/user")
	public ResponseEntity<?> add(User user){
		return null;
		
	}
	
	@PutMapping("/user")
	public ResponseEntity<?> update(User user){
		return null;
	}
	
	@GetMapping("/user")
	public ResponseEntity<Guest> getUser(){
		
		return new ResponseEntity<Guest>(new Guest(),HttpStatus.ACCEPTED);
	}
}