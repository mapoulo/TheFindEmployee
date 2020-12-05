package com.Department.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Department {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int departmentId;
	
	
	private String departmentName;
	

}
