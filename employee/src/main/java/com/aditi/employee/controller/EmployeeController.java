package com.aditi.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditi.employee.entity.Employee;
import com.aditi.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getEmployee/{employeeName}")
	public ResponseEntity<Employee> getEmployee(@PathVariable String employeeName){
		Employee employee = employeeService.getEmployee(employeeName);
		System.out.println(employee);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
		
	@PostMapping("/saveSeniorEmployee")
	public ResponseEntity<Employee> saveSeniorEmployee(@RequestBody Employee employee){
		employeeService.saveSeniorEmployee(employee);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);	
	}
	
	@PostMapping("/saveJuniorEmployee")
	public ResponseEntity<Employee> saveJuniorEmployee(@RequestBody Employee employee){
		employeeService.saveJuniorEmployee(employee);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);	
	}
	
	
}
