package com.jspiders.springcorexml.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBean {

	int id;
	String name;
	String email;
	long contact;

}
