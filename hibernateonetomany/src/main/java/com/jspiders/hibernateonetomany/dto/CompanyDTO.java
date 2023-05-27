package com.jspiders.hibernateonetomany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class CompanyDTO {
	
	@Id
	private int id;
	private String name;
	private String doe;
	private String address;
	@OneToMany
	List<EmployeeDTO> employees;

}
