package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.StudentDTO;

public class StudentDAO {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("hibernate");
		EntityManager entityManager = 
				entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = 
				entityManager.getTransaction();
		
		entityTransaction.begin();
		
		StudentDTO student1 = new StudentDTO();
		student1.setSid(1);
		student1.setSname("Shivam");
		student1.setSemail("shivam@gmail.com");
		student1.setSmarks(70);
		student1.setSadd("Pune");
		
		entityManager.persist(student1);
		
		entityTransaction.commit();
		
		
		
	}

}
