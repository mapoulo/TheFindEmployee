package com.EmployeeService.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.EmployeeService.demo.Models.Employee;
import com.EmployeeService.demo.Repositories.EmployeeRepository;
import com.EmployeeService.demo.ValueObject.Department;
import com.EmployeeService.demo.ValueObject.RetTemplateVO;

@Service
public class EmployeeService {
	
	   
	@Autowired
	private EmployeeRepository repo;
	@Autowired
	private RestTemplate restTemplate;
	
	
	public void saveEmployee(Employee employee) {
		repo.save(employee);
	}
	
	
	
	public List findAllEmployees() {
		List employee = new ArrayList<>();
		repo.findAll().forEach(employee::add);
		return employee;
	}
	
	
	public Employee findEmployeeByName(String name) {
		return repo.findByemployeeName(name);
	}


	public RetTemplateVO getUserWithDepartment(int userId) {
		User user = repo.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/"+userId, Department.class);
		RetTemplateVO  restTemplateVO  = new RetTemplateVO();
		restTemplateVO.setUser(user);
		restTemplateVO.setDepartment(department);
		return restTemplateVO;
	}
	

}
