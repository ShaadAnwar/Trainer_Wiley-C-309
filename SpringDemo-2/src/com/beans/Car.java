package com.beans;

public class Car {
	private String chasisNo, color, fuelType;
	private long price;
	private double average;
	
	public void show() {
		System.out.println("Details of car :"+chasisNo+"With color:"+color+" Price is:"+price);
	}
	public Car()
	{
		chasisNo="eng00";
		color="bakers Chocklate";
		fuelType="diesel";
		price=450000;
		average=12;
		
		
	}
//	public Car(String chasisNo, String color, String fuelType, long price, double average) {
//		super();
//		this.chasisNo = chasisNo;
//		this.color = color;
//		this.fuelType = fuelType;
//		this.price = price;
//		this.average = average;
//	}


}
