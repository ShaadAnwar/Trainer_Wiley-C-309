package com.person;

import java.util.Arrays;
import java.util.List;

public class PersonProcessJava7Way1 {
	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("John","Doe",34),
				new Person("William","Smith",44),
				new Person("David","Soneta",34)
				);
		System.out.println("Employees starting last name with S==>");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastName().startsWith("S");
			}
			
		});
		System.out.println("Employees starting last name with D==>");
		printConditionally(people, new Condition(){
			
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastName().startsWith("D");
			}
		});
		
	}
	public static void printConditionally(List<Person> people, Condition condition) {
		for(Person person:people) {
			if(condition.test(person))
				System.out.println(person);
		}
	}

}
