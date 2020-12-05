package com.Department.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Department.demo.Models.Department;
import com.Department.demo.Repositories.DepartmentRepo;

@Service
public class DepartmentService {
	
	
	@Autowired
	private DepartmentRepo repo;
	
	public void saveDepartment(Department department) {
		repo.save(department);
	}
	
	
	
	public Department findBydepartmentName(String name) {
		return repo.findBydepartmentName(name);
	}
	
	public List getAllDepartment() {
		List departments = new ArrayList<>();
		
		repo.findAll().forEach(departments::add);
		return departments;
		
	}
	
	


}
