package com.mb.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mb.entity.Employee;
import com.mb.repo.EmployeeRepo;

@Service
public class EmployeeService {
	private EmployeeRepo empRepo;

	public EmployeeService(EmployeeRepo empRepo) {
		super();
		this.empRepo = empRepo;
	}
	
//	get emps with sort
	public void getEmps(String column) {
//		Iterable<Employee> findAll = empRepo.findAll();
		Sort sort = Sort.by(column).descending();
		Iterable<Employee> findAll = empRepo.findAll(sort);
		findAll.forEach(e -> System.out.println(e));
	}
	
//	pagination
	public void getEmpsWithPagination(int pageSize, int pageNo) {
		PageRequest of = PageRequest.of(pageNo-1, pageSize);
		Page<Employee> findAll = empRepo.findAll(of);
		List<Employee> content = findAll.getContent();
		content.forEach(System.out::println);
	}

	public void getEmpsByQBE() {
		Employee emp = new Employee();	
//		emp.setEmpDept("Dev");
//		Example<Employee> of = Example.of(emp);
		Example<Employee> example = Example.of(emp);
//		List<Employee> findAll = empRepo.findAll(of);
		List<Employee> findAll = empRepo.findAll(example);
		findAll.forEach(e -> System.out.println(e));
	}
}
