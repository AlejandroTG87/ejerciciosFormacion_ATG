package com.indra.formacio.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.indra.formacio.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepoMethods{
	
	@PersistenceContext	//JPA annotation
//	@Autowired	//Spring Annotation
	protected EntityManager entityManager;

	public List<Employee> findBySurname(String surname) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> findByFecha_alta(Calendar fecha_alta) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> findByData_alta(Calendar fecha_alta) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Employee> consulta (Calendar cal){
	
	List<Employee> listAux;
	listAux = (List<Employee>)entityManager.createQuery("FROM Employee e where e.DATA_ALTA <= :fechaAux ")
		.setParameter("fechaAux", cal.getTime())
	        .getResultList();
	
	return listAux;
	
	}
}
	
//	@SuppressWarnings("unchecked")
//	public List<Employee> findBySurname(String surname){
//		Query q = entityManager.createQuery("FROM Customer c WHERE c.surname = :sur");
//		q.setParameter("sur", surname);
//		return (ArrayList<Customer>)q.getResultList();
		
//	};

