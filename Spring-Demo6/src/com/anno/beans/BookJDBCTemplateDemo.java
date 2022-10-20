package com.anno.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookJDBCTemplateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		//CustomerDAO customerDAO=(CustomerDAO)context.getBean("customerDAOImpl");
		
		//CustomerDAO customerDAO=(CustomerDAO)context.getBean("customerDAOJDBCSupportImpl");
		CustomerDAO customerDAO=(CustomerDAO)context.getBean("customerDAOJDBCNamedParameterImpl");
		
		int rows=customerDAO.addCustomer(new Customer(102,"John Doe"));
		if(rows>0)
			System.out.println("Record inserted successfully");
		else
			System.out.println("Record not inserted");
		
		
		
		
	}

}
