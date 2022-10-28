package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
@Autowired
BookRepository bookRepository;

	@GetMapping("/books/{id}")
	public Optional<Book> getBook(@PathVariable Long id) throws BookNotFoundException {
		Optional<Book> book =bookRepository.findById(id);
		if(!book.isPresent())
			throw new BookNotFoundException(("id="+id));
		return book;
	}

}

/*
 * use @Modifying and @Transactional annotations to modify the database for custom methods 
*/