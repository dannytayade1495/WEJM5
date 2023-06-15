package com.jspiders.springcoreannotations.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonBean {
	
	@Value("1")
	int id;
	@Value("Manish")
	String name;
	@Value("manish007@gmail.com")
	String email;
	@Autowired
	AadharBean aadhar;

}
