package com.situ.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.situ.boot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	//通过年龄来查询
	public List<Student> findByAge(Integer age);
}
