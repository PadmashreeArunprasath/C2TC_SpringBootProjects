package com.tnsif.springioc;

import org.springframework.stereotype.Component;

@Component
public class Customer2 {
	private int cid;
	private String name;
	private String city;
	
	
	public Customer2() {
		System.out.println("Customer2 class obj created");
	}
	public void order() {
		System.out.println("customer2 ordering product");
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
