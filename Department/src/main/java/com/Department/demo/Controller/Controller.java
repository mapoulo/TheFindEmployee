package com.Department.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class Controller {

	@GetMapping("/")
	public String getss() {
		return "Heeeeeeee eeeee";
	}
}
