package com.Department.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Department {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int departmentId;
	
	
    private String departmentName;

}
