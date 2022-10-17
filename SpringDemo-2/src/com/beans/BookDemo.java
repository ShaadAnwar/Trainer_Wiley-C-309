package com.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		LibraryList mybooklist=(LibraryList)applicationContext.getBean("booklist");
		mybooklist.displayBooks();
	}

}
