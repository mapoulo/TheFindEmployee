package com.Department.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Department.demo.Service.DepartmentService;
import com.Department.demo.models.Department;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService service;
	
	
	@PostMapping("/")
	public void addDepartment(@RequestBody Department department) {
		service.saveDepartment(department);
	}
	
	
	@GetMapping("/{name}")
	public Department findDepartmentByName(@PathVariable String name) {
		
		return service.findDepartmentByName(name);
	}

}
