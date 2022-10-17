package com.beans;

public class Employee {
	private int empId;
	private String empName;
	private String deptName;
	
	public Employee() {
		
	}
	public Employee(int empId, String empName,String deptName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptName=deptName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return empId+" , "+empName+", "+deptName;
	}
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		
	}
	
	
	
	

}
