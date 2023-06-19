package com.jspiders.springmvc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "stud_details")
public class StudentPOJO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "stud_id")
	private int id;
	@Column(name = "stud_name")
	private String name;
	@Column(name = "email_id")
	private String email;
	@Column(name = "mobile_no")
	private long mobile;
	@Column(name = "stud_add")
	private String address;

}
