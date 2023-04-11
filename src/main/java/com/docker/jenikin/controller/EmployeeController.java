package com.docker.jenikin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.jenikin.entity.Employee;
import com.docker.jenikin.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
		Employee employee=employeeService.saveEmployeeDetails(emp);
		return new ResponseEntity<>(employee,HttpStatus.CREATED);
	}
	@GetMapping("/findAll")
	public ResponseEntity<Employee> findAllEmployees(){
		List<Employee> list=employeeService.findAllEmployeeDetails();
		return new ResponseEntity(list,HttpStatus.OK);
	}

}
