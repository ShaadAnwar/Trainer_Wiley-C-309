package com.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyMVCController {
	
//	@RequestMapping(value="welcomeController.htm", method=RequestMethod.GET)
//	public ModelAndView welcome() {
//		String welcome_message="Welcome to the wonderful world of Books!!";
//		return new ModelAndView("welcome","message",welcome_message);
//		
//	}
	
	@RequestMapping(value="welcomeController.htm",method=RequestMethod.GET)
	public ModelAndView welcome()
	{
		System.out.println("request received");
		String welcome_message="Welcome to the wonderful world of Books!!!";
		return new ModelAndView("welcome","message",welcome_message);
	}
	
	@RequestMapping(value="hello.htm",method=RequestMethod.POST)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");
		System.out.println("controller loaded !!");

		Map<String, String> map = new HashMap<String,String>();
		map.put("name", name);

		return new ModelAndView("welcome1", map);
	}
}
/*
 * Component-->Controller : used to annotate a class which controls the web application
 * and which servers for web requests.
 */

