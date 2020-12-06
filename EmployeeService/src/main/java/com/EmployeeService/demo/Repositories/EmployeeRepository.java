package com.EmployeeService.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeService.demo.Models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findEmployeeByemployeeId(int id);

}
