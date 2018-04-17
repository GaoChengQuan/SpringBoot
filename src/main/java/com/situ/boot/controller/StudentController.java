package com.situ.boot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.situ.boot.entity.Student;
import com.situ.boot.repository.StudentRepository;

@RestController
public class StudentController {
    private Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    //添加
    @PostMapping("/students")
    public Student save(Student student) {
        return  studentRepository.save(student);
    }

    //查询
    @GetMapping("/students/{id}")
    public Student findById(@PathVariable("id") Integer id) {
        return studentRepository.findById(id).get();
    }

    //更新
    @PutMapping("/students/{id}")
    public Student update(@PathVariable("id") Integer id,
                           @RequestParam("name") String name,
                           @RequestParam("age") Integer age) {
    	Student student = new Student();
    	student.setId(id);
    	student.setName(name);
    	student.setAge(age);
        return studentRepository.save(student);
    }

    //删除
    @DeleteMapping(value = "/students/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
    	studentRepository.deleteById(id);
    }

    //通过年龄查询学生
    @GetMapping("/students/age/{age}")
    public List<Student> findByAge(@PathVariable("age") Integer age) {
        return studentRepository.findByAge(age);
    }
}
