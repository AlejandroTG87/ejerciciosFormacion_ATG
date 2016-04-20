package com.indra.formacio.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.indra.formacio.model.Employee;

public interface EmployeeRepoMethods {
	
	List<Employee> findBySurname(String surname);
	
	
}
