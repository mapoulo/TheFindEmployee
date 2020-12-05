package com.Department.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Department.demo.Repository.DepartmentRepository;
import com.Department.demo.models.Department;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository repo;
	
	
	public void saveDepartment(Department department) {
		repo.save(department);
	}
	
	
	public Department findDepartmentByName(String name) {
		return repo.findDepartmentByName();
	}

}
