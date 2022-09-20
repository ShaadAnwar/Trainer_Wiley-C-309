package com.collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class PropertyDemo {
	public static void main(String[] args) throws SQLException {
//		Properties p=new Properties();  
//		//setting the properites
//		p.setProperty("name","Mandar Jog");  
//		p.setProperty("email","mandarmjog@gmail.com"); 
//		
//		
//		//getting properites
//		System.out.println(p);
//		System.out.println(p.getProperty("name"));
//		
//		System.out.println(System.getProperties());
		
		
		//System.setProperty("Jdbc.drivers", "com.mysql.jdbc.Driver");
	      Properties properties=getProperties();
	      //Getting the connection
	      String url = "jdbc:mysql://localhost/mydatabase";
	      Connection con = DriverManager.getConnection(url, properties);
	      //DriverManager.getConn
	      System.out.println("Connection established: "+ con);
	}
	
	public static Properties getProperties() {
		Properties properties = new Properties();
	      properties.put("user", "root");
	      properties.put("password", "root123");
	      
	      ArrayList<int[]> mylist=new ArrayList<>();
	      mylist.add(new int[] {3,5,23});
	      
	      int[] numberArray=mylist.get(0);
	      
	      
	      
	      
	      
	      
	      return properties;
	      
	      
	}
}
