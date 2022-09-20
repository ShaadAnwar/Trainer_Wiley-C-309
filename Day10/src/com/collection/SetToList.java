package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(1);
        System.out.println(a);
        
        //Type 1
        List<Integer> arr = new ArrayList<>(a);//overloaded costructor of the List, which can take existing collection
        System.out.println(arr);
        System.out.println(arr.get(1));
        
        //Type2
        List<Integer> arr1 = new ArrayList<>();
        for (int i : a)
            arr1.add(i);
        System.out.println(arr1);
        System.out.println(arr1.get(1));
        
        //Type3
        List<Integer> arr2 = new ArrayList<>();
        arr2.addAll(a);//addAll method takes existing collection to the list
        System.out.println(arr2.get(1));
        
       
	}

}
