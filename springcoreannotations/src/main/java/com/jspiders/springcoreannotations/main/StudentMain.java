package com.jspiders.springcoreannotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotations.beans.StudentBean;
import com.jspiders.springcoreannotations.config.StudentConfig;

public class StudentMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext
									(StudentConfig.class);
		StudentBean student1 = (StudentBean)context.getBean("student1");
		System.out.println(student1);
		((AnnotationConfigApplicationContext)context).close();
		
	}

}
