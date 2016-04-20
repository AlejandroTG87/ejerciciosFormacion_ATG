package com.indra.formacio;

import org.springframework.beans.factory.annotation.Autowired;

import com.indra.formacio.dao.CustomerRepository;
import com.indra.formacio.dao.EmployeeRepository;

public class Enterprise {

	@Autowired
	CustomerRepository cRepo;
	@Autowired
	EmployeeRepository eRepo;
	
	
	public void pintaEmpleats(){
		System.out.println(cRepo.count());
	}

	public CustomerRepository getcRepo() {
		return cRepo;
	}

	public void setcRepo(CustomerRepository cRepo) {
		this.cRepo = cRepo;
	}
	
	public void main (){}
	
}
