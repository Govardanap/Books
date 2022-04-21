package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Ticket;

@Service
public interface TicketService {
	List<Ticket> fetchTicket(String name);
	void addTicket(Ticket t);
	Ticket deleteTicket(int tid);
	List<Ticket> viewTicket();

}
