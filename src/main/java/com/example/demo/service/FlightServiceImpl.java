package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Flight;
import com.example.demo.repositories.FlightRepository;
@Service
public class FlightServiceImpl implements FlightService{
	@Autowired
	FlightRepository repo;

	@Override
	public List<Flight> fetchFlightList(String start, String destination) {
		List<Flight> list=repo.findAll();
		return list.stream().filter(x-> x.getSource().equalsIgnoreCase(start) && x.getDestination().equalsIgnoreCase(destination)).collect(Collectors.toList());
	}

	@Override
	public int calculatefare(int cost,int number) {
		int result=cost*number;
		return result;
	}

	@Override
	public Flight getFlight(int id) {
		Flight f=repo.getById(id);
		return f;
	}
	}

