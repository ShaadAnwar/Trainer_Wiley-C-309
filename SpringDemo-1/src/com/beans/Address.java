package com.beans;

public class Address {
	private String buildingName;
	private String streetName;
	private String cityName;
	
	public Address() {
		
	}

	@Override
	public String toString() {
		return "Address [buildingName=" + buildingName + ", streetName=" + streetName + ", cityName=" + cityName + "]";
	}

	public Address(String buildingName, String streetName, String cityName) {
		super();
		this.buildingName = buildingName;
		this.streetName = streetName;
		this.cityName = cityName;
	}
	
	
	
	
	

}
