package com.springcore;

import org.springframework.stereotype.Component;

@Component("goldCustomer")
public class GoldCustomer implements Customer{
	
	public void save() {

		System.out.println("Welcome");

	}
	
	private int id;
	private String name;
	private Address address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public GoldCustomer(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public GoldCustomer() {
		super();
	}
	
	public void setAddress(Address address) {
	    this.address = address;
	}

	
//	@Override
//	public String toString() {
//		return id+ ", "+ name+ ", "+address;
//	}
//	
	
	public void start() {

		System.out.println("Welcome start");
	}
	
	public void stop() {

		System.out.println("Welcome stop");
	}
	
	
	
		

}
