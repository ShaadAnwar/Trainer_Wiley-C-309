package com.autowiring.beans;

public class DepartmentBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

/*
 * <bean id="dept" class="DepartmentBean">
 *   <property name="name" value="sales">
 * </bean>
 * <bean id="emp" class="EmployeeBean">
 *   <property name="fullname" value="John doe">
 *   <property name="departmentbean" ref="dept">
 * </bean>
 * 
 * 
 * 
 * 
 */
