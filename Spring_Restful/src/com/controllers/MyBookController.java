package com.controllers;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.beans.Book;

@RestController
@EnableWebMvc
public class MyBookController {

	List<Book> books;

	public MyBookController() {
		// TODO Auto-generated constructor stub
		books = new ArrayList<>();
		books.add(new Book("Spring 5.0", 12345l, "Publication1", 1000, "Description", "Author1"));
	}

	@GetMapping("/books") //RestController
	//@RequestMapping(value="/books",method=RequestMethod.GET): Controller
	public List<Book> getAllBooks() {

		return books;
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {

		System.out.println("book added" + book.getDescription());
		books.add(book);
		return book;
	}

	

	@PutMapping("/books/{ISBN}/{price}")
	public Book updateBook(@PathVariable long ISBN, @PathVariable  int price) {

		// search for the book
		Book book = new Book();
		book.setISBN(ISBN);
		boolean found = false;
		for (Book b : books) {
			if (b.getISBN() == book.getISBN()) {
				b.setPrice(price);
				found = true;
				book = b;
			}
		}
		return book;
	}

	@GetMapping("/books/{ISBN}")
	public Book getBook(@PathVariable long ISBN) {

//		Book book = new Book();
//		book.setISBN(ISBN);
		boolean found = false;
		for (Book b : books) {
			if (b.getISBN() == ISBN) {
				found = true;
//				book = b;
				return b;
			}

		}

		return null;
	}

	@DeleteMapping("/books/{ISBN}")
	public Book deleteBook(@PathVariable long ISBN) {
		Book book = new Book();
		book.setISBN(ISBN);
		boolean found = false;
		if(books.contains(book))
		{
			books.remove(book);
		}
		return book;
	}

	@GetMapping("/books-entity/{ISBN}")
	public ResponseEntity<String> getBook1(@PathVariable long ISBN) {

		Book book = new Book();
		book.setISBN(ISBN);
		boolean found = false;
		for (Book b : books) {
			if (b.getISBN() == book.getISBN()) {
				found = true;
				book = b;
			}

		}
		if(found)
			
		{ 
			//new ResponseEntity
			return new ResponseEntity("Book Available!!", HttpStatus.OK); 
		}
		 return new ResponseEntity<String>("Book Not Available",HttpStatus.OK);
	}

	@DeleteMapping("/books-entity/{ISBN}")
	public ResponseEntity<Book> deleteBook1(@PathVariable long ISBN) {
		Book book = new Book();
		book.setISBN(ISBN);
		boolean found = false;
		if(books.contains(book))
		{
			books.remove(book);
			found=true;
		}
		if(found)
		{ 
			return new ResponseEntity(book, HttpStatus.FOUND); 
		}
		 return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
	}
	
	@PostMapping("/books-entity")
	public ResponseEntity<Book> addBook1(@RequestBody Book book) {

		System.out.println("book added" + book.getDescription());
		books.add(book);
		return new ResponseEntity(book, HttpStatus.CREATED); 
	}
}
