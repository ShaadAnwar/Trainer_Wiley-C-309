package com.datetime;

import java.time.LocalDate;
import java.time.Period;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate startLocalDate=LocalDate.of(2020, 3,12);
		LocalDate endLocalDate=LocalDate.of(2020, 7, 20);
		
		Period periodBetween=Period.between(startLocalDate, endLocalDate);
		
		System.out.println(periodBetween);
		
		System.out.println(periodBetween.getDays());
		System.out.println(periodBetween.getMonths());
		System.out.println(periodBetween.getYears());

	}

}
