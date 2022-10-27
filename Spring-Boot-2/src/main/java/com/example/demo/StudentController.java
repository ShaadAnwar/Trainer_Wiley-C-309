package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")

public class StudentController {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringBoot2Application.class);
	
	@Autowired
	StudentService service;
	
	@PostMapping("/create")
	public void create(@RequestBody Student student) {
		service.createStudent(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> get(){
		logger.info("someone trying to get all students information !!");
		return service.getAllStudents();
	}

	//String str="/get/{id}";
	
	@GetMapping("/get/{id}")
	public Student getById(@PathVariable("id") String id) {
		return service.getStudentById(id);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable("id") String id,@RequestBody Student student) {
		service.updateStudent(id, student);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable("id") String id) {
		service.deleteStudentById(id);
	}
	
	@Scheduled(fixedRate = 1000)
	public void continuousTask() {
		System.out.println("Task is executing");
	}

}
