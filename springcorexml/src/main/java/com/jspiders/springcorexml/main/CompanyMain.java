package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.bean.CompanyBean;

public class CompanyMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("CompanyConfig.xml");
		CompanyBean company1 = context.getBean(CompanyBean.class);
		System.out.println(company1);
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
