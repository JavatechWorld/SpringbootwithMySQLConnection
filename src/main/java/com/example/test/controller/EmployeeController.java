package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.model.Employee;
import com.example.test.repository.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepo employeerepo;
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		
		return employeerepo.save(emp);
	}
}
