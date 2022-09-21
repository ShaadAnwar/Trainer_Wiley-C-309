package com.person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonProcessJava8Way2 {
	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("John","Doe",34),
				new Person("William","Smith",44),
				new Person("David","Soneta",34)
				);
		//Person p;
		System.out.println("Employees starting last name with S==>");
		printConditionally(people, (p)->p.getLastName().startsWith("S"),p->System.out.println(p));
		System.out.println("Employees starting last name with D==>");
		printConditionally(people, (p)->p.getLastName().startsWith("D"),p->System.out.println(p));
		
	}
	public static void printConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
		people.forEach((p)->{if(condition.test(p))
				consumer.accept(p);
		});
//		for(Person person:people) {
//			if(condition.test(person))
//				consumer.accept(person);
//		}
	}

}
