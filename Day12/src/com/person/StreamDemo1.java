//Using Method reference
package com.person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo1 {
	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("John","Doe",34),
				new Person("William","Smith",50),
				new Person("David","Soneta",38)
				);
		
	System.out.println("Createing Streams :");
	people.stream().forEach(System.out::println);//forEach is terminal function
	
	System.out.println("Persons with age more than 34 ==>");
	people.stream().filter((p)->p.getAge()>34).forEach(System.out::println);//filter is intermediate function
	
	System.out.println("Number of persons with age more than 34 :");
	long numberOfPerson=people.stream().filter((p)->p.getAge()>34).count();
	System.out.print(numberOfPerson);
	
	
	List<String> data=people.stream().filter((p)->p.getAge()>34)
		.map(Person::getFirstName)
		.map(String::toUpperCase)
		//.forEach(p->System.out.println(p));
		.collect(Collectors.toList());
	
	data.forEach(p->System.out.println(p));
	System.out.println(people);
	
	
	System.out.println(people.stream()
		.map(Person::getAge)
		.reduce(0,(carry,age)->carry+age));
	
	
	System.out.println(people.stream()
		.mapToInt(Person::getAge)
		.sum());
	
	
	Optional<Person> person=people.stream()
		.max((person1, person2)->person1.getAge()-person2.getAge());
	
	System.out.println(person);
	
	if(person.isPresent()) {
		System.out.println(person.get());
	}
	
	
	
	
	
	
			
	
	}

}
