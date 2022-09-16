package com.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime instance=LocalDateTime.now();
		System.out.println(instance);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm");
		
		String formatteDateTime=formatter.format(instance);
		System.out.println(formatteDateTime);
		

	}

}
