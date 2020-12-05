package com.Department.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.Department.demo.Models.Department;

public interface DepartmentRepo extends CrudRepository<Department, Integer> {

	Department findBydepartmentName(String name);

}
