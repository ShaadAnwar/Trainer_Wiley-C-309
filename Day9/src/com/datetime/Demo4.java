package com.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class Demo4 {
	public static void main(String[] args) {
		LocalTime start=LocalTime.of(10, 2, 10);
		LocalTime end=LocalTime.of(11, 2,8);
		
		Duration d=Duration.between(start, end);
		System.out.println(d);
	
		long duration=Duration.between(start, end).toMillis();
		System.out.println(duration);
		
		Instant startInstant=Instant.now();
		System.out.println(startInstant);
	
	}

}
