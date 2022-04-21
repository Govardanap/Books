package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Passenger;
import com.example.demo.repositories.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {
@Autowired
PassengerRepository repo;
	@Override
	public List<Passenger> fetchPassengerList() {
		List<Passenger> list=repo.findAll();
		return list;
	}

	@Override
	public Passenger updatePassenger(Passenger p, int pid) {
		Passenger pr=repo.getById(pid);
		pr.setPname(p.getPname());
		pr.setAge(p.getAge());
		pr.setGender(p.getGender());
		pr.setHome_address(p.getHome_address());
		repo.save(pr);
		return pr;
	}

	@Override
	public Passenger deleteProdcutById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePassenger(Passenger p) {
		repo.save(p);
		
	}

}
