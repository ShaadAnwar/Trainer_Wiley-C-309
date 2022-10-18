package com.beans;

public class Vehicle {
	String vehicleType,vehicleColor;
	
	public Vehicle() {
		
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public Vehicle(String vehicleType, String vehicleColor) {
		super();
		this.vehicleType = vehicleType;
		this.vehicleColor = vehicleColor;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleType=" + vehicleType + ", vehicleColor=" + vehicleColor + "]";
	}
	
	

}
