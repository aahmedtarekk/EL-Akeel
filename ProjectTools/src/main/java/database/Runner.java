package com.lab.task.model;

import javax.ejb.Stateful;
import javax.persistence.Id;

@Stateful
public class Runner {
	
	@Id
	private int id;

	private String name;
	private boolean status;
	private double delivery_fees;
		
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getDelivery_fees() {
		return delivery_fees;
	}
	public void setDelivery_fees(double delivery_fees) {
		this.delivery_fees = delivery_fees;
	}

	

}
