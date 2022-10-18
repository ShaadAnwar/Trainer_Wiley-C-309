package com.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LifeCycleBean implements InitializingBean, BeanNameAware, BeanFactoryAware, DisposableBean {
	BeanFactory beanFactory=null;
	
	public LifeCycleBean() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor invoked !!");
	}

	//InitializingBean Method
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet() invoked!!");
	}

	//BeanNameAware method
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName() method invoked!!");
	}

	//BeanFactoryAware method
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		this.beanFactory=beanFactory;
		System.out.println("setBeanFactory() method invoked!!");
		
	}

	//DisposableBean Method
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy() method invoked!!");
	}
	

	public void show() {
		System.out.println("Demonstration of the Lifecycle of Spring Bean !!");
	}

	
	
	
}
