package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NestedMapWithList {
	HashMap<String, ArrayList<Car>> cars = new HashMap<String, ArrayList<Car>>(); 
	
	public static void main(String[] args) {
		NestedMapWithList list=new NestedMapWithList();
		list.addToList("Tata", new Car("abc123"));
		list.addToList("Tata", new Car("xyz123"));
//		list.addToList("vokeswagon", new Car("abc123")); 
//		
		
	}
	public void addToList(String mapKey, Car myCar) { 
		
		ArrayList<Car> carsList = cars.get(mapKey); 
	 
	    // if list does not exist create it 
	    if(carsList == null) { 
	         carsList = new ArrayList<Car>(); 
	         carsList.add(myCar); 
	         cars.put(mapKey, carsList); //making the entry of new key in the map, if not available
	    } else { 
	        // add if Car is not already in list 
	        if(!carsList.contains(myCar)) 
	        	carsList.add(myCar); 
	    } 
	    System.out.println(cars);
	}   

}
