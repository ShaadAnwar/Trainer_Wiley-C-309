package com.beans;

import java.util.HashSet;

public class LibrarySet {
	HashSet<Book> books;
	
	

	public HashSet<Book> getBooks() {
		return books;
	}

	public void setBooks(HashSet<Book> books) {
		this.books = books;
	}
	
	public void displayBooks() {
		for(Book b:books)
			System.out.println(b);
	}
	

}
