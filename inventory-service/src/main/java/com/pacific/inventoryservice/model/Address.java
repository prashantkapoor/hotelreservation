package com.pacific.inventoryservice.model;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	String id;

	String address;
	String state;
	String country;
	String city;
	
	@OneToOne(mappedBy = "address")
    private Hotel hotel;
	
	
	public String getAddressId() {
		return id;
	}
	public void setAddressId(String addressId) {
		this.id = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
