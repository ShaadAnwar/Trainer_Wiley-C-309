package com.beans;

public class Customer {
	private int custId;
	private String custName;
	private Address custAddress;
	
	public Customer() {
		
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + "]";
	}

	public Customer(int custId, String custName, Address custAddress) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}


	
	
	
}
