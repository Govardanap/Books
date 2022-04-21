package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Flight;
import com.example.demo.model.Passenger;
import com.example.demo.model.Ticket;
import com.example.demo.service.FlightService;
import com.example.demo.service.PassengerService;
import com.example.demo.service.TicketService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
@Autowired
PassengerService service;
@Autowired
TicketService obj;
@Autowired
FlightService obj1;
@GetMapping("/bookingticket/{id}/{number}")
public int bookTicket(@PathVariable(value="id")Integer id,@PathVariable(value="number")Integer number) {
	Flight f=obj1.getFlight(id);
	int cost=f.getFare();
	int result= obj1.calculatefare(cost,number);
	System.out.println("Cost of ticket for the given flight id is"+result);
	return result;

}
@PostMapping("/enterdetails")
public ResponseEntity<Passenger> saveDetails(@RequestBody Passenger p){
	Passenger pass=p;
	service.savePassenger(p);
	return new ResponseEntity<Passenger>(pass,HttpStatus.OK);
	
}
@PutMapping("/editdetails/{id}")
public ResponseEntity<Passenger> updateDetails(@PathVariable(value="id")Integer id,@RequestBody Passenger p){
	service.updatePassenger(p, id);
	return new ResponseEntity<Passenger>(p,HttpStatus.OK);
	
}

@GetMapping("/displayticket/{name}")
public List<Ticket> fetchticket(@PathVariable(value="name")String name){
	List<Ticket> list=obj.fetchTicket(name);
	return list;
}
@DeleteMapping("/cancelticket/{id}")
public ResponseEntity<Ticket> deleteTicket(@PathVariable(value="id")Integer id) {
	Ticket ticket=obj.deleteTicket(id);
	return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
}
}
