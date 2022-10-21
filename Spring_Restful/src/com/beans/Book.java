package com.beans;

import java.io.Serializable;

public class Book implements Serializable{
	private String bookName;
	private long ISBN;
	private String publication;
	private int price;
	private String description;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String bookName, long ISBN, String publication,int price,String description, String author) {
		// TODO Auto-generated constructor stub
		this.bookName=bookName;
		this.ISBN =ISBN;
		this.publication=publication;
		this.price=price;
		this.description=description;
		this.author=author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookName+"\t"+description+"\t"+price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ISBN ^ (ISBN >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
	
	

}
