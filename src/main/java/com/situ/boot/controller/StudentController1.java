package com.situ.boot.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.situ.boot.entity.Student;

@RestController
public class StudentController1 {
	
	//http://localhost:8082/situ/students/1
	/*@GetMapping("/students/{id}")
	public String findById(@PathVariable("id") Integer id) {
		return "id: " + id;
	}*/
	
	//http://localhost:8082/situ/students?id=1
	/*@GetMapping("/students")
	public String findById(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
		return "id: " + id;
	}*/
}
