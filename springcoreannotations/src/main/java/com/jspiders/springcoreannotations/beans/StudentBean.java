package com.jspiders.springcoreannotations.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBean {

//	@Value("1")
	int id;
//	@Value("Satish")
	String name;
//	@Value("satish123@gmail.com")
	String email;

}
