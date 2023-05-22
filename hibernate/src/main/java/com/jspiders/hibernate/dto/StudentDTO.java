package com.jspiders.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentDTO {
	
	@Id
	private int sid;
	private String sname;
	private String semail;
	private int smarks;
	private String sadd;

}
