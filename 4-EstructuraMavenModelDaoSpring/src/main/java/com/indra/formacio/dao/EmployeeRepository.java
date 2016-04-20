package com.indra.formacio.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.indra.formacio.model.Customer;
import com.indra.formacio.model.Employee;

import com.indra.formacio.dao.EmployeeRepositoryImpl;

public interface EmployeeRepository  extends CrudRepository<Employee, Long>, EmployeeRepositoryImpl {
	List<Employee> findByName(String name);

	List<Employee> findBySurname(String surname);
	
	List<Employee> findByBirthday(Date data);
	
	List<Employee> consulta (Calendar cal);
	
}
