package com.mongo.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.curd.model.Employee;
import com.mongo.curd.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveOrUpdate(Employee emp){
		return employeeRepository.save(emp);
	}
	
	public List<Employee> findAll()
	{
		return employeeRepository.findAll();
	}
	
	public void delete(Employee emp){
		employeeRepository.delete(emp);
		
	}
}
