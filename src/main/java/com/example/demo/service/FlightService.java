package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Flight;

@Service
public interface FlightService {

	List<Flight> fetchFlightList( String start, String destination);
	int calculatefare(int cost,int number);
	Flight getFlight(int id);


}
