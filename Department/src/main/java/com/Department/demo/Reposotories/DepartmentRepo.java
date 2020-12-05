package com.Department.demo.Reposotories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Department.demo.Models.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
