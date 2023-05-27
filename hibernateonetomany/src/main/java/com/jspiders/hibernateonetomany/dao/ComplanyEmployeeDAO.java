package com.jspiders.hibernateonetomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernateonetomany.dto.CompanyDTO;
import com.jspiders.hibernateonetomany.dto.EmployeeDTO;

public class ComplanyEmployeeDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("OneToMany");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			EmployeeDTO employee1 = new EmployeeDTO();
			employee1.setId(1);
			employee1.setName("Arjun");
			employee1.setEmail("arjun@tcs.in");
			employee1.setDesignation("Developer");
			employee1.setSalary(25000);
			manager.persist(employee1);
			
			EmployeeDTO employee2 = new EmployeeDTO();
			employee2.setId(2);
			employee2.setName("Bhavna");
			employee2.setEmail("Bhavna@tcs.in");
			employee2.setDesignation("Manager");
			employee2.setSalary(50000);
			manager.persist(employee2);
			
			EmployeeDTO employee3 = new EmployeeDTO();
			employee3.setId(3);
			employee3.setName("Chetan");
			employee3.setEmail("chetan@tcs.in");
			employee3.setDesignation("Team Lead");
			employee3.setSalary(35000);
			manager.persist(employee3);
			
			List<EmployeeDTO> employees = 
					Arrays.asList(employee1, employee2, employee3);
			
			CompanyDTO company1 = new CompanyDTO();
			company1.setId(1);
			company1.setName("TCS");
			company1.setDoe("10-05-1990");
			company1.setAddress("Pune");
			company1.setEmployees(employees);
			manager.persist(company1);
			
			transaction.commit();
		} finally {
			closeConnection();
		}
	}

}
