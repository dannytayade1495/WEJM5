package com.jspiders.hibernatemanytomany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class SubjectDTO {
	
	@Id
	private int id;
	private String name;
	private int duration;
	@ManyToMany(mappedBy = "subjects")
	private List<StudentDTO> students;

}
