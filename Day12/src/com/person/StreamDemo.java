package com.person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("John","Doe",34),
				new Person("William","Smith",50),
				new Person("David","Soneta",38)
				);
		
	System.out.println("Createing Streams :");
	people.stream().forEach((p)->System.out.println(p));//forEach is terminal function
	
	System.out.println("Persons with age more than 34 ==>");
	people.stream().filter((p)->p.getAge()>34).forEach(p->System.out.println(p));//filter is intermediate function
	
	System.out.println("Number of persons with age more than 34 :");
	long numberOfPerson=people.stream().filter((p)->p.getAge()>34).count();
	System.out.print(numberOfPerson);
	
	
	List<String> data=people.stream().filter((p)->p.getAge()>34)
		.map(name->name.getFirstName())
		.map(name->name.toUpperCase())
		//.forEach(p->System.out.println(p));
		.collect(Collectors.toList());
	
	data.forEach(p->System.out.println(p));
	System.out.println(people);
	
	
	System.out.println(people.stream()
		.map(name->name.getAge())
		.reduce(0,(carry,age)->carry+age));
	
			
	
	}
}
