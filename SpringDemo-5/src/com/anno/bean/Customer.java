package com.anno.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//Bean is created with id as decapitalized name of class 
public class Customer {//customer
	private int customerId;
	private String customerName;
	
	@Autowired
	@Qualifier(value="address")
	private Address customerAddress;
	
	public Customer() {
		customerId=102;
		customerName="Wilson";
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
}
