package com.te.springhibernate.beans;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.te.springhibernate.config.EntityManagerConfig;

public class Read {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EntityManagerConfig.class);
		EntityManagerDemo demo = context.getBean(EntityManagerDemo.class);
		EntityManager entityManager = demo.getEntityManager();
		String query = "from Movies where id=:id";
		Query queryIssued = entityManager.createQuery(query);
		queryIssued.setParameter("id", 4);
		Movies movies = (Movies) queryIssued.getSingleResult();
		System.out.println(movies.getMname());
		System.out.println(movies.getMrating());
		System.out.println(movies.getMreview());
		System.out.println("--------------------------------------------------------");

		((AbstractApplicationContext) context).close();

	}

}