package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Client1{
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Company company = new Company();
		//company.setCompanyId(101);
		company.setName("Teja");
		Employee employee = new Employee();
		employee.setEmployeeId(0);
		employee.setName("Teja");
		employee.setSalary(70000);
		company.setEmployee(employee);
		em.persist(company);
		em.getTransaction().commit();
		System.out.println("Added one company with employee in database");
		em.close();
		factory.close();
	}
}