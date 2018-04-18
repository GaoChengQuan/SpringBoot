package com.situ.boot.mapper;

import java.util.List;

import com.situ.boot.entity.Student;

public interface StudentMapper {
	List<Student> findAll();

	void deleteById(Integer id);

	Student findById(Integer id);

	void update(Student student);

	void add(Student student);
}
