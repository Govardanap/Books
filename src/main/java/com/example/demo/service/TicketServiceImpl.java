package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ticket;
import com.example.demo.repositories.TicketRepository;
@Service
public class TicketServiceImpl implements TicketService {
@Autowired
TicketRepository repo;
	

	@Override
	public void addTicket(Ticket t) {
		repo.save(t);
		
	}

	@Override
	public Ticket deleteTicket(int tid) {
		Ticket t=repo.getById(tid);
		repo.deleteById(tid);
		return t;
	}

	@Override
	public List<Ticket> fetchTicket(String name) {
		List<Ticket> list=repo.findAll();
		return list.stream().filter(x -> x.getPname().equalsIgnoreCase(name)).collect(Collectors.toList());
	}

	@Override
	public List<Ticket> viewTicket() {
	  List<Ticket> li=repo.findAll();
	  
	  return li;
	}

}
