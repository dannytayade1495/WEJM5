package com.jspiders.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.studentmanagement.pojo.StudentPOJO;
import com.jspiders.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;

	public StudentPOJO addStudent(StudentPOJO pojo) {
		StudentPOJO student = repository.save(pojo);
		return student;
	}

	public StudentPOJO searchStudent(int id) {
		StudentPOJO student = repository.findById(id).orElse(null);
		return student;
	}

	public List<StudentPOJO> searchAllStudents() {
		List<StudentPOJO> students = repository.findAll();
		return students;
	}

	public StudentPOJO searchStudent(String name) {
		StudentPOJO student = repository.findByName(name);
		return student;
	}

	public StudentPOJO searchStudentByAddress(String address) {
		StudentPOJO student = repository.findByAddress(address);
		return student;
	}

}
