package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot4Application implements CommandLineRunner{
	
	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookRepository.save(new Book("Thinking in Java", "38592983"));
		bookRepository.save(new Book("learn Java 9", "38592984"));
		bookRepository.save(new Book("Modular Java Programming", "38592985"));
		 
		for(Book book:bookRepository.findAll()) {
			System.out.println(book);
		}
		
		Book b=bookRepository.findById(1L).get();
		System.out.println("Book with ID: 1:->");
		System.out.println(b);
		
		
		Book b2=bookRepository.findByIsbn("38592984");
		System.out.println(b2);
	}

}
