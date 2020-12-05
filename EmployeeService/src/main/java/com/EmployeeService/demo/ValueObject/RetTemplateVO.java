package com.EmployeeService.demo.ValueObject;

import org.apache.catalina.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RetTemplateVO {
	
	private Department department;
	private User user;

}
