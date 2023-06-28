package com.jspiders.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspiders.studentmanagement.pojo.StudentPOJO;

public interface StudentRepository extends JpaRepository<StudentPOJO, Integer> {

	StudentPOJO findByName(String name);
	
	StudentPOJO findByAddress(String address);
	
}
