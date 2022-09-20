package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector<String> vector = new Vector<>();
		  
	        // Adding values to the Vector
	        vector.add("Keep");
	        vector.add("Calm");
	        vector.add("and");
	        vector.add("learn");
	        vector.add("Java");
	     
	  
	        // Displaying the values of the vector
	        System.out.println("The elements of the Vector is : "
	                           + vector);
	  
	        // Creating the Enumeration of the Vector elements.
	        Enumeration enumeration = vector.elements();
	  
	        // Now Enumerating through the Vector and 
	          // printing each enumeration constant.
	        System.out.println(
	          "The output after Enumerating through the Vector : ");
	        while (enumeration.hasMoreElements()) {
	            System.out.println(enumeration.nextElement());
	        }

	}

}
