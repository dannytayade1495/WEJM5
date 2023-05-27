package com.jspiders.hibernatemanytomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernatemanytomany.dto.StudentDTO;
import com.jspiders.hibernatemanytomany.dto.SubjectDTO;

public class StudentSubjectDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("ManyToMany");
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
			
			StudentDTO student1 = new StudentDTO();
			student1.setId(1);
			student1.setName("Amar");
			student1.setEmail("amar@gmail.com");
			student1.setAddress("Pune");
			
			StudentDTO student2 = new StudentDTO();
			student2.setId(2);
			student2.setName("Akbar");
			student2.setEmail("akbar@gmail.com");
			student2.setAddress("Mumbai");
			
			List<StudentDTO> students = 
					Arrays.asList(student1, student2);
			
			SubjectDTO subject1 = new SubjectDTO();
			subject1.setId(1);
			subject1.setName("Core Java");
			subject1.setDuration(3);
			subject1.setStudents(students);
			manager.persist(subject1);
			
			SubjectDTO subject2 = new SubjectDTO();
			subject2.setId(2);
			subject2.setName("Advance Java");
			subject2.setDuration(3);
			subject2.setStudents(students);
			manager.persist(subject2);
			
			List<SubjectDTO> subjects = 
					Arrays.asList(subject1, subject2);
			
			student1.setSubjects(subjects);
			manager.persist(student1);
			
			student2.setSubjects(subjects);
			manager.persist(student2);
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}

}
