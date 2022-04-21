package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyIntitializer","handler"})

@Entity
public class Flight implements Serializable {
	@Id
	int flightid;
	String flightname;
	String source;
	String destination;
	int fare;
	int no_of_seats_in_economy;
	int no_of_seats_in_buisness;
	String doj;
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	int no_of_seats_in_first_class;
	public Flight(int flightid, String flightname, String source, String destination, int fare,
			int no_of_seats_in_economy, int no_of_seats_in_buisness, int no_of_seats_in_first_class, String doj) {
		super();
		this.flightid = flightid;
		this.flightname = flightname;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.no_of_seats_in_economy = no_of_seats_in_economy;
		this.no_of_seats_in_buisness = no_of_seats_in_buisness;
		this.no_of_seats_in_first_class = no_of_seats_in_first_class;
		this.doj=doj;
	}
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public int getNo_of_seats_in_economy() {
		return no_of_seats_in_economy;
	}
	public void setNo_of_seats_in_economy(int no_of_seats_in_economy) {
		this.no_of_seats_in_economy = no_of_seats_in_economy;
	}
	public int getNo_of_seats_in_buisness() {
		return no_of_seats_in_buisness;
	}
	public void setNo_of_seats_in_buisness(int no_of_seats_in_buisness) {
		this.no_of_seats_in_buisness = no_of_seats_in_buisness;
	}
	public int getNo_of_seats_in_first_class() {
		return no_of_seats_in_first_class;
	}
	public void setNo_of_seats_in_first_class(int no_of_seats_in_first_class) {
		this.no_of_seats_in_first_class = no_of_seats_in_first_class;
	}
	
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Flight [flightid=" + flightid + ", flightname=" + flightname + ", source=" + source + ", destination="
				+ destination + ", fare=" + fare + ", no_of_seats_in_economy=" + no_of_seats_in_economy
				+ ", no_of_seats_in_buisness=" + no_of_seats_in_buisness + ", doj=" + doj
				+ ", no_of_seats_in_first_class=" + no_of_seats_in_first_class + "]";
	}
	
	
}
