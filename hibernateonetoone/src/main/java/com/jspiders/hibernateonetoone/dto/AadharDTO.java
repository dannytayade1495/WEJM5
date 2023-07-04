package com.jspiders.hibernateonetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AadharDTO {
	
	@Id
	private int id;
	private long aadhar_no;
	private String doi;
//	@OneToOne
//	private PersonDTO person;

}
