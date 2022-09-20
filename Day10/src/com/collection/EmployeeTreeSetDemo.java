package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("John","Doe");
		Employee e2=new Employee("Davis","Smith");
		Employee e3=new Employee("John","Doe");
		Employee e4=new Employee("Williams","Sakosa");
		Employee e5=new Employee("Alan","Lamb");
		
		Set<Employee> empSet=new TreeSet<Employee>();
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		
		System.out.println("Employees in descending lastname sort algo:");
		for(Employee emp:empSet) {
			System.out.println(emp);
		}
		
		
		//Collections.sort(list, new Comparator());
		List<Employee> empList=new ArrayList<Employee>();
		empList.addAll(empSet);//add the objects from Set to genrate the List
		Collections.sort(empList,new EmployeeSortByAscendingFirstName());
		
		System.out.println("Employees in ascending firstName sort algo:");
		for(Employee emp:empList) {
			System.out.println(emp);
		}
		
	}

}
