package com.Department.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Department.demo.models.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	Department findDepartmentByName();

}
