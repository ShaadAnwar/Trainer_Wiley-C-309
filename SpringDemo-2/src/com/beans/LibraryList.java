package com.beans;

import java.util.List;

public class LibraryList {
	private List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void displayBooks() {
		for(Book b:books) {
			System.out.println(b);
		}
	}
	
	

}
