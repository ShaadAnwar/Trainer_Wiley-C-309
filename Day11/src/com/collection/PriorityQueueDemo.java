package com.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Using the add() method
        numbers.add(4);//throws exception
        numbers.add(2);
        System.out.println("PriorityQueue: " + numbers);

        // Using the offer() method
        numbers.offer(1);//return false
        System.out.println("Updated PriorityQueue: " + numbers); 
        //head is always the small numbers... but not the sorted
    }
}
