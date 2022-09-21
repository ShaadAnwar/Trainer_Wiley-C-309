package com.person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonProcessJava7Way {
	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("John","Doe",34),
				new Person("William","Smith",44),
				new Person("David","Soneta",34)
				);
		
		sortEmployeeByLastName(people);
		displayAllEmployees(people);
		displayAllEmployeesWithLastNameS(people);
		
	}

	private static void displayAllEmployeesWithLastNameS(List<Person> people) {
		// TODO Auto-generated method stub
		System.out.println("Employees with last name starting with S ==>");
		for(Person person:people) {
			if(person.getLastName().startsWith("S"))
				System.out.println(person);
		}
		
	}

	private static void displayAllEmployees(List<Person> people) {
		// TODO Auto-generated method stub
		System.out.println("List of the Employees ==>");
		for(Person person:people) {
			//if(person.getLastName().startsWith("S"))
				System.out.println(person);
		}
	}

	private static void sortEmployeeByLastName(List<Person> people) {
		// TODO Auto-generated method stub
		System.out.println("Employess sorted by last name ==> ");
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		for(Person person:people) {
			//if(person.getLastName().startsWith("S"))
				System.out.println(person);
		}
		
	}

}
