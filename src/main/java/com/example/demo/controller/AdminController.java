package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Passenger;
import com.example.demo.model.Ticket;
import com.example.demo.service.PassengerService;
import com.example.demo.service.TicketService;

@RestController
@RequestMapping("/admin")
public class AdminController {
@Autowired
PassengerService service;
@Autowired
TicketService obj1;
@GetMapping("/displaypassenger")
public List<Passenger> fetchdetails(){
	List<Passenger> list=service.fetchPassengerList();
	for(Passenger p:list)
		System.out.println(p+"\n");
	return list;
	
}
@PostMapping("/addticket")
public void addticket(@RequestBody Ticket t) {
	Ticket ticket=t;
	obj1.addTicket(t);
	System.out.println("added ticket");
}
@GetMapping("/viewticket")
public List<Ticket> fetchticket(){
	List<Ticket> list=obj1.viewTicket();
	for(Ticket t:list)
		System.out.println(t+"\n");
	return list;
}
}
