package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.bean.PersonBean;

public class PersonMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("PersonConfig.xml");
		PersonBean person1 = context.getBean(PersonBean.class);
		System.out.println(person1);
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
