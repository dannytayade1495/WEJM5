package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.EmployeeDTO;

public class EmployeeInsertDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("hibernate");
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

			EmployeeDTO emp1 = new EmployeeDTO();
//			emp1.setId(1);
			emp1.setName("Sara");
			emp1.setDesignation("Motivation");
			emp1.setSalary(150);

			EmployeeDTO emp2 = new EmployeeDTO();
//			emp2.setId(2);
			emp2.setName("Shubman");
			emp2.setDesignation("Batsman");
			emp2.setSalary(420);

			manager.persist(emp1);
			manager.persist(emp2);

			transaction.commit();
		} finally {
			closeConnection();
		}
	}

}
