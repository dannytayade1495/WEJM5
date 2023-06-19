package com.jspiders.springmvc.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "admin_data")
public class AdminPOJO {
	
	@Id
	private String username;
	
	private String password;

}
