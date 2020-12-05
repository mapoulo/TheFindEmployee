package com.EmployeeService.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.EmployeeService.demo.Models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	Employee findByemployeeName(String name);


	

}
