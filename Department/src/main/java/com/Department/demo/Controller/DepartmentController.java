package com.Department.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/department")
public class DepartmentController {
	

     @GetMapping("/s")	
	public String name() {
		return "ddddddddd";
	}
	

}
