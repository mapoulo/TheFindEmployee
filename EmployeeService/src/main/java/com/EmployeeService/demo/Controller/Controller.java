package com.EmployeeService.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeService.demo.Models.Employee;
import com.EmployeeService.demo.Services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class Controller {
	
	@Autowired
	private EmployeeService service;
	
	
	@PostMapping("/")
	public void saveEmployee(Employee employee) {
		service.saveEmployee(employee);
	}
	
	@GetMapping("/")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeByEmployeeId(@PathVariable int id) {
		return service.getEmployeeByEmployeeId(id);
	}
	

	

}
