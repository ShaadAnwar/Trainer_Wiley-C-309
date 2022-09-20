package com.collection;

import java.util.Arrays;
import java.util.List;

public class EmployeeArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e1=new Employee("John","Doe");
//		Employee e2=new Employee("Davis","Smit");
//		Employee e3=new Employee("John","Doe");
//		Employee e4=new Employee("Williams","Sakosa");
//		Employee e5=new Employee("Alan","Lamb");
//		
//		ArrayList<Employee> empList=new ArrayList<Employee>();
//		empList.add(e1);
//		empList.add(e2);
//		empList.add(e3);
//		empList.add(e4);
//		empList.add(e5);
		
		List<Employee> empList=Arrays.asList(new Employee("John","Doe"),new Employee("Davis","Smit"),new Employee("John","Doe"),new Employee("Williams","Sakosa"),new Employee("Alan","Lamb"));
		System.out.println(empList);
		for(Employee employee: empList) {
			System.out.println(employee);
		}
		
		

	}

}
