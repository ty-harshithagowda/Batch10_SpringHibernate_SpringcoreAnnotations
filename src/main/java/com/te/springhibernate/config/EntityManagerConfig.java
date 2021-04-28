package com.te.springhibernate.config;

package com.te.springhibernate.config;

import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springhibernate.beans.EntityManagerDemo;

@Configuration
public class EntityManagerConfig {
    @Bean
	public EntityManagerDemo getEntityManagerDemo() {
    	EntityManagerDemo entityManagerDemo= new EntityManagerDemo();
		 entityManagerDemo.setEntityManager(Persistence.createEntityManagerFactory("Many").createEntityManager());;
		return entityManagerDemo;
	}
}
