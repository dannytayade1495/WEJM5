package com.jspiders.springcoreannotations.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcoreannotations.beans.StudentBean;

public class StudentConfig {
	
	@Bean("student1")
	public StudentBean getStudent() {
		return new StudentBean(1,"Satish","satish0123@gmail.com");
	}

}
