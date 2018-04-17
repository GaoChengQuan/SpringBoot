package com.situ.boot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.situ.boot.entity.Student;
import com.situ.boot.repository.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testHello() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk()) // 200 ok
				.andDo(MockMvcResultHandlers.print()) //打印出执行结果
				.andReturn();
	}
	
	@Test
	public void test2() {
		Student student = new Student();
		studentRepository.findAll();//查找所有
		studentRepository.findById(1);//根据id查找
		studentRepository.save(student);//保存
		studentRepository.deleteById(1);//根据id产出
		studentRepository.delete(student);//根据对象删除
		studentRepository.count();//返回总记录数
		studentRepository.existsById(1);//指定id是否存在
	}
}
