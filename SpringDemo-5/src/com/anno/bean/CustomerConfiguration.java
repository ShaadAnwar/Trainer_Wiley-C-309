package com.anno.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.anno.*")
public class CustomerConfiguration {
	
	@Bean(name = "customer1")
	public Customer myCustomer() {
		Customer c=new Customer();
		c.setCustomerId(103);
		c.setCustomerName("Dave Dykes");
		return c;
	}
}
