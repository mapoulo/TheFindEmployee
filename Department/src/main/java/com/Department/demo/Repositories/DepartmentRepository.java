package com.Department.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Department.demo.Models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
