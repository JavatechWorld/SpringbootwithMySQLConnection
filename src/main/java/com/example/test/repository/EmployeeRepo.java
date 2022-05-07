package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
