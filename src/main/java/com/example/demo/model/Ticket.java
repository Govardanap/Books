package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket implements Serializable {
	@Id
	int ticketid;
	String pname;
	String flightname;
	String source;
	String destination;
	String classtype;
	int amount;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int ticketid, String pname, String flightname, int amount,String source,String destination,String classtype) {
		super();
		this.ticketid = ticketid;
		this.pname = pname;
		this.flightname = flightname;
		this.amount = amount;
		this.source=source;
		this.destination=destination;
		this.classtype=classtype;
	}
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
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
	public String getClasstype() {
		return classtype;
	}
	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}
	@Override
	public String toString() {
		return "Ticket [ticketid=" + ticketid + ", pname=" + pname + ", flightname=" + flightname + ", source=" + source
				+ ", destination=" + destination + ", classtype=" + classtype + ", amount=" + amount + "]";
	}
	
	
	

}
