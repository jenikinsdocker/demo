package com.docker.jenikin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.jenikin.entity.Employee;
import com.docker.jenikin.repository.EmployeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeRepository employeRepository;
	
	public Employee saveEmployeeDetails(Employee emp) {
		return employeRepository.save(emp);
		
	}
	
	public List<Employee> findAllEmployeeDetails(){
		List<Employee> list=employeRepository.findAll();
		return list;
		
	}

}
