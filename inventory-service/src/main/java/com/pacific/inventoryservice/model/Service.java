package com.pacific.inventoryservice.model;

import javax.persistence.*;

@Entity
@Table(name="service")
public class Service {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer serviceId;
	private String name;
	private Long cost;
	
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
}
