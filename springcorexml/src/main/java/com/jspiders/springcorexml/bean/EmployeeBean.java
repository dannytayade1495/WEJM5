package com.jspiders.springcorexml.bean;

import lombok.Data;

@Data
public class EmployeeBean {
	
	int id;
	String name;
	double salary;
	CompanyBean company;

}
