package com.pacific.inventoryservice.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String roomId;
	
	@Enumerated(EnumType.STRING)
	private Category type;
	private boolean available;
	private Long baseCharge;
	
	//@OneToMany(fetch = FetchType.LAZY)
	//private List<Service> services;
	
	public Long getBaseCharge() {
		return baseCharge;
	}
	public void setBaseCharge(Long baseCharge) {
		this.baseCharge = baseCharge;
	}
	
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public Category getType() {
		return type;
	}
	public void setType(Category type) {
		this.type = type;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	/*public List<Service> getServices() {
		return services;
	}
	public void setServices(List<Service> services) {
		this.services = services;
	}*/
	
}
