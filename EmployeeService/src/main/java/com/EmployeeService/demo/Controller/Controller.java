package com.EmployeeService.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class Controller {
	
	
	@GetMapping("/")
	public String  get() {
		return "Hello ther in Employees";
	}

}
