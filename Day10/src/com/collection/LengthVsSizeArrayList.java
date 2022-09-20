package com.collection;
//Arrays to List:Arrays.asList
//List to Array: 
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//List to Array
//Array to List
public class LengthVsSizeArrayList {  
    public static void main(String[] args) {  
        //creating Arraylist  
        List<String> fruitList = new ArrayList<>();  
        //adding String Objects to fruitsList ArrayList  
        fruitList.add("Mango");  
        fruitList.add("Banana");  
        fruitList.add("Apple");  
        fruitList.add("Strawberry");  
        fruitList.add("Pineapple");  
        
        //converting List to Array
        System.out.println("Converting ArrayList to Array" );  
        String[] item = fruitList.toArray(new String[fruitList.size()]);  //toArray(new datatype[size])
        for(String s : item){  
            System.out.println(s);  
        }  
        
        
        //converting array to List
        System.out.println("Converting Array to ArrayList" );  
        List<String>l2 = new ArrayList<>();  
        l2 =  Arrays.asList(item);  //asList(array)
        System.out.println(l2);  
        
        
        
        
        
        
   
    }  
}  