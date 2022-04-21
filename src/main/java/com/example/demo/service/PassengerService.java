package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Passenger;

@Service
public interface PassengerService {
	List<Passenger> fetchPassengerList();
	Passenger updatePassenger(Passenger p,int pid);
	Passenger deleteProdcutById(int pid);
	void savePassenger(Passenger p);
}
