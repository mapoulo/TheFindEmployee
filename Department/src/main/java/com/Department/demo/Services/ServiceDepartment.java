package com.Department.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Department.demo.Models.Department;
import com.Department.demo.Reposotories.DepartmentRepo;

@Service
public class ServiceDepartment {
	
	@Autowired
	private DepartmentRepo repo;
	
	
	public void saveDepartment(Department department) {
		repo.save(department);
	}
	
	
	public Department findDepartmentByName(String name) {
		return repo.findDepartmentByName(name);
	}

}
