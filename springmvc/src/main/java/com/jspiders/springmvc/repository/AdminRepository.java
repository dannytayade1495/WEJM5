package com.jspiders.springmvc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jspiders.springmvc.pojo.AdminPOJO;

@Repository
public class AdminRepository {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static Query query;
	private static String jpql;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("mvc");
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
		if (transaction != null) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
		}
	}
	
	public AdminPOJO addAdmin(String username, String password) {
		openConnection();
		transaction.begin();
		AdminPOJO pojo = new AdminPOJO();
		pojo.setUsername(username);
		pojo.setPassword(password);
		manager.persist(pojo);
		transaction.commit();
		closeConnection();
		return pojo;
	}
	
	public List<AdminPOJO> getAdmin(){
		openConnection();
		transaction.begin();
		jpql = "from AdminPOJO";
		query = manager.createQuery(jpql);
		List<AdminPOJO> admin = query.getResultList();
		transaction.commit();
		closeConnection();
		return admin;
	}

	public AdminPOJO login(String username, String password) {
		openConnection();
		transaction.begin();
		jpql = "from AdminPOJO "
				+ "where username = '" + username + "' "
				+ "and password = '" + password + "'";
		query = manager.createQuery(jpql);
		AdminPOJO pojo = (AdminPOJO)query.getSingleResult();
		if (pojo != null) {
			transaction.commit();
			closeConnection();
			return pojo;
		}
		transaction.commit();
		closeConnection();
		return null;
	}

}
