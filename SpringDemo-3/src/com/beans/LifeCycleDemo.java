package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("lifecycle.xml");
		LifeCycleBean lifeCycleBean=(LifeCycleBean)applicationContext.getBean("life");
		lifeCycleBean.show();
		//shutdown for spring container
		((AbstractApplicationContext)applicationContext).registerShutdownHook();

	}

}
