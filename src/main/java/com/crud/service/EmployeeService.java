package com.crud.service;

import java.util.List;
import java.util.Optional;

import com.crud.model.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	
	public String removeEmployee(int id);
	
	public Optional<Employee> findEmpById(int id);
	
	public List<Employee> getAllEmploye();
	
	public String updateEmployee(int id);
	
	

}
