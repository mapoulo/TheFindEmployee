package com.Department.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Department.demo.Models.Department;
import com.Department.demo.Repositories.DepartmentRepository;

@Service
public class DepartmentService {
	
	
	@Autowired
	private DepartmentRepository repo;
	
	
	public void saveDepartment(Department department) {
		repo.save(department);
	}
	
	
	public Department getDepartmentById(int id) {
		return repo.findDepartmentBydepartmentId(id);
	}
	
	
	public List<Department> getAllDepartment(){
		List departments = new ArrayList<>();
		repo.findAll().forEach(departments::add);
		return departments;
	}

}
