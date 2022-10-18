package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans2.xml");
		Car car=(Car)applicationContext.getBean("carobj");
		car.show();

	}

}
