package com.Department.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Department.demo.Models.Department;
import com.Department.demo.Services.DepartmentService;



@RestController
@RequestMapping("/department")
public class DepartmentController {
	

	@Autowired
	private DepartmentService service;
	
   
     
     
   @PostMapping("/")
   public String saveDepartment(@RequestBody Department department) {
	   service.saveDepartment(department);
	   return "The department is saved ";
   }
   
   
   @GetMapping("/{name}")
   public Department findBydepartmentName(@PathVariable String name) {
	   return service.findBydepartmentName(name);
   }
   
   @GetMapping("/all")
	public List getAllDepartment() {
	    return service.getAllDepartment();	
	}
   
	

}
