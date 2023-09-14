package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {
public static void main(String[] args) {
 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("devesh");
 EntityManager entityManager=entityManagerFactory.createEntityManager();
 EntityTransaction entityTransaction=entityManager.getTransaction();
 
 
 Person person=new Person();

 person.setName("diksha");
 person.setEmail("diksha@mail.com");
 person.setCno(758946123);
 
 Pan pan=new Pan();
 pan.setAddress("nerul");
 pan.setPerson(person);
 
 entityTransaction.begin();
 entityManager.persist(person);
 entityManager.persist(pan);
 entityTransaction.commit();
}
}
