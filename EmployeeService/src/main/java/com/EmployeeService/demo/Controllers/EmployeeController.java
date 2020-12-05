package com.EmployeeService.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeService.demo.Models.Employee;
import com.EmployeeService.demo.Services.EmployeeService;
import com.EmployeeService.demo.ValueObject.RetTemplateVO;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
    @Autowired
	private EmployeeService service;
	
    
    @PostMapping("/")
	public String saveEmployee(@RequestBody Employee employee) {
		service.saveEmployee(employee);
		return "The employee is save successfully ";
	}
    
    
    @GetMapping("/")
    public List getAllEmployees() {
    	return service.findAllEmployees();
    }
    
 
    
    @GetMapping("/{id}")
    public RetTemplateVO getUserWithDepartment(@PathVariable int id) {
    	return service.getUserWithDepartment(id);
    }
    
    
}
