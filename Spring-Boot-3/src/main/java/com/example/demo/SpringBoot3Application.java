package com.example.demo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBoot3Application {

	 @Bean
	    JdbcTemplate getJdbcTemplate(DataSource dataSource) {
	        JdbcTemplate jdbcTemplate = new JdbcTemplate();
	        jdbcTemplate.setDataSource(dataSource);
	        jdbcTemplate.setQueryTimeout(20); //20 seconds
	        jdbcTemplate.setFetchSize(10);  //fetch 10 rows at a time
	        return jdbcTemplate;
	    }

	    public static void main(String[] args) {
	        SpringApplication.run(SpringBoot3Application.class, args);
	    }

}
