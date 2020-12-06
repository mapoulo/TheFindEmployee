package com.EmployeeService.demo.RestTemplateValueObjects;

import com.EmployeeService.demo.Models.Employee;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RestTemplateVO {
	
	private Department department;
	private Employee employee;

}
