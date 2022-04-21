package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyIntitializer","handler"})

@Entity
public class Passenger implements Serializable {
	@Id
	String pname;
	int age;
	String gender;
	String id_proof;
	int id_number;
	String home_address;

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(String pname, int age, String gender, String id_proof, int id_number, String home_address) {
		super();
		this.pname = pname;
		this.age = age;
		this.gender = gender;
		this.id_proof = id_proof;
		this.id_number = id_number;
		this.home_address = home_address;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getId_proof() {
		return id_proof;
	}

	public void setId_proof(String id_proof) {
		this.id_proof = id_proof;
	}

	public int getId_number() {
		return id_number;
	}

	public void setId_number(int id_number) {
		this.id_number = id_number;
	}

	public String getHome_address() {
		return home_address;
	}

	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}

	@Override
	public String toString() {
		return "Passenger [pname=" + pname + ", age=" + age + ", gender=" + gender + ", id_proof=" + id_proof
				+ ", id_number=" + id_number + ", home_address=" + home_address + "]";
	}
}
