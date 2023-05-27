package com.jspiders.hibernateonetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class PersonDTO {
	
	@Id
	private int id;
	private String name;
	private long contact;
	private String dob;
	private String address;
	@OneToOne
	@JoinTable(name = "person_aadhar_details",
				joinColumns = @JoinColumn(referencedColumnName = "id"),
				inverseJoinColumns = @JoinColumn(referencedColumnName = "id"))
	private AadharDTO aadhar;

}
