package com.jspiders.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "emp")
public class EmployeeDTO {
	
	@Id
	@Column(name = "empno")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "ename")
	private String name;
	@Column(name = "job")
	private String designation;
	@Column(name = "sal")
	private int salary;

}
