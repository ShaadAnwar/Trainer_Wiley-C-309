package com.person;

import java.util.Arrays;
import java.util.List;

public class PersonProcessJava8Way {
	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("John","Doe",34),
				new Person("William","Smith",44),
				new Person("David","Soneta",34)
				);
		//Person p;
		System.out.println("Employees starting last name with S==>");
		printConditionally(people, (p)->p.getLastName().startsWith("S"));
		System.out.println("Employees starting last name with D==>");
		printConditionally(people, (p)->p.getLastName().startsWith("D"));
		
	}
	public static void printConditionally(List<Person> people, Condition condition) {
		for(Person person:people) {
			if(condition.test(person))
				System.out.println(person);
		}
	}

}
