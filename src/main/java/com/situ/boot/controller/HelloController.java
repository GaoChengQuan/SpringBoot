package com.situ.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.situ.boot.properties.StudentProperties;

@RestController
public class HelloController {
	@Value("${name}")
	private String name;
	
	@Value("${age}")
	private Integer age;
	
	@Value("${content}")
	private String content;
	
	@Autowired
	private StudentProperties studentProperties;
	
	@RequestMapping("/hello2")
	public String hello2() {
		return studentProperties.getName() + " , " + studentProperties.getAge();
	}

	@RequestMapping("/hello")
	public String hello() {
		return name + " : " + age + " , " + content;
	}
	
	//@RequestMapping(value = "/test", method = RequestMethod.GET)
	@GetMapping(value = "/test")
	public void test() {
		
	}
}
