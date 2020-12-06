package com.EmployeeService.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeService.demo.Models.Employee;
import com.EmployeeService.demo.Repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	
	public void saveEmployee(Employee employee) {
		repo.save(employee);
	}
	
	
	public Employee getEmployeeByEmployeeId(int id) {
		return repo.findEmployeeByemployeeId(id);
	}
	
	public List<Employee> getAllEmployees(){
		List employees = new ArrayList<>();
		repo.findAll().forEach(employees::add);
		return employees;
	}

}
