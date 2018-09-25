package com.siri.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	private int vehicleId;
	private String vehicleName;
	
	
	
	public Vehicle() {
		super();
	}
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="vehicle_id")
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	@Column(name = "vehicle_name")
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	
	
	
}

	
	


