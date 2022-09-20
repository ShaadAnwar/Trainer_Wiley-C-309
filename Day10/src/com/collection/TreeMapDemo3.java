package com.collection;

import java.util.TreeMap;

public class TreeMapDemo3 {
	public static void main(String arg[])
    {
        TreeMap<Integer, String> listOfNames = new TreeMap<Integer, String>();
        listOfNames.put(3, "C");
        listOfNames.put(1, "A");
        listOfNames.put(2, "D");
        listOfNames.put(6, "B");
        listOfNames.put(8, "B");
        
        System.out.println("Map :"+listOfNames.tailMap(3));    
    }
}
