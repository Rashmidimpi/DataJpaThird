package com.mb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mb.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	

}
