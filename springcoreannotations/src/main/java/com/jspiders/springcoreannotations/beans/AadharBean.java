package com.jspiders.springcoreannotations.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AadharBean {
	
	@Value("1")
	int id;
	@Value("123456789123")
	long aadhar_no;
	@Value("13-June-2020")
	String date_of_issue;

}
