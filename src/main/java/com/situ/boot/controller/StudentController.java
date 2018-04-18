package com.situ.boot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.boot.entity.Student;
import com.situ.boot.mapper.StudentMapper;

@Controller
public class StudentController {
    private Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentMapper studentMapper;
    
    @RequestMapping("/index")
    public String index() {
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
    	List<Student> list = studentMapper.findAll();
    	model.addAttribute("list", list);
    	return "list";
    }
    
    @RequestMapping("/deleteById")
    public String deleteById(Integer id) {
		studentMapper.deleteById(id);
		return "redirect:/list";
	}
    
    @RequestMapping("/toUpdate")
    public String toUpdate(Model model, Integer id) {
		Student student = studentMapper.findById(id);
		model.addAttribute("student", student);
		return "update";
	}
    
    @RequestMapping("/update")
    public String update(Student student) {
    	studentMapper.update(student);
    	return "redirect:/list";
	}
    
    @RequestMapping("/getAddPage")
    public String getAddPage() {
		return "add";
	}
    
    @RequestMapping("/add")
    public String add(Student student) {
		studentMapper.add(student);
		return "redirect:/list";
	}
}
