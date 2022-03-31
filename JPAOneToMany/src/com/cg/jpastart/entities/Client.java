package com.cg.jpastart.entities;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		
		Department department = new Department();
		department.setId(108);
		department.setName("Sales");
		
		Department department1 = new Department();
		department1.setId(109);
		department1.setName("Fashion");
		
		Employee e1 = new Employee();
		e1.setId(8);
		e1.setName("va");
		e1.setSalary(500000);
		
		Employee e2 = new Employee();
		e2.setId(9);
		e2.setName("rag");
		e2.setSalary(400000);
		
		
		department.addEmployee(e1);
		department1.addEmployee(e2);
		
		em.persist(department);
		em.persist(department1);
		
		System.out.println("Added department along with two employees to database.");
		System.out.println("Super");
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
