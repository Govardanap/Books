package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;
import com.example.demo.service.FlightService;
import com.example.demo.service.PassengerService;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;

@RestController
@RequestMapping("/flight")
public class FlightController {
	@Autowired
	FlightService service;
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("hello world");
		return "Test passed successfully";
	}
	@GetMapping("/fetch/{start}/{destination}")
	public List<Flight> fetchFlightList(@PathVariable(value="start")String start,@PathVariable(value="destination")String destination){
		List<Flight> flight=service.fetchFlightList(start,destination);
		for(Flight f:flight) 
			System.out.println(f+"\n");
		return flight;
	
	}
	
		
	}


