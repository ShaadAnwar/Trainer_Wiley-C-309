package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
	Book findByIsbn(String isbn);//structured method name for custom query
	
//	@Query(name="Book.findQuery1")
//	Book findBookbyName(String name);//Query annotation for generating custom query
//	

}

//@sql


//@Query
