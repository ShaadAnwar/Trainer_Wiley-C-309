package com.collection;

public class Employee implements Comparable<Employee> {
	private String firstName,lastName;
	

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	//	this.salary=salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int hashCode() {
		return this.firstName.length();
	}
	
	//must be overridden if the obejcts are added in the Set
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("equals() method invoked !!");
		Employee e=(Employee)obj;
		return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName);
		
	}

	public String toString() {
		return this.firstName +" : "+this.lastName;
	}
	//this method gets invoked by treeset to re-arrange the objects 
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.lastName.compareTo(this.lastName);
	}

}
