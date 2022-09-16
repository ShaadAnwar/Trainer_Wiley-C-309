package com.serialize;

import java.io.Serializable;

public class Employee implements Serializable {
	private int empId;
	private String empName;
	private double empSalary;
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}
