package com.axis.service;

import java.util.List;

import com.axis.entity.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	

}
