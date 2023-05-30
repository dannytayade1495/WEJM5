package com.jspiders.jpql.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "trainer_details")
public class TrainerDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "t_id")
	private int id;
	@Column(name = "t_name")
	private String name;
	@Column(name = "sub")
	private String subject;
	@Column(name = "mail_id")
	private String email;

}
