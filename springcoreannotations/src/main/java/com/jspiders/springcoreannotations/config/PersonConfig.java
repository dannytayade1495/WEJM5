package com.jspiders.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jspiders.springcoreannotations.beans.PersonBean;

@ComponentScan(basePackages = "com.jspiders.springcoreannotations")
public class PersonConfig {
	
	@Bean("person1")
	public PersonBean getPerson() {
		return new PersonBean();
	}

}
