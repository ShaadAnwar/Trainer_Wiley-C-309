package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//default scope is "singleton"
public class BeanScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans2.xml");
		Vehicle v1=(Vehicle)applicationContext.getBean("vehicle1");
		System.out.println("First Vehicle Before Modification:"+v1);
		Vehicle v2=(Vehicle)applicationContext.getBean("vehicle1");
		System.out.println("Second Vehicle Before Modification:"+v2);
		
		v1.setVehicleColor("Grey");
		System.out.println("First Vehicle After Modification:"+v1);
		System.out.println("Second Vehicle After Modification:"+v2);
	}

}
