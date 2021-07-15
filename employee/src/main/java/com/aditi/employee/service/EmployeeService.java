package com.aditi.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditi.employee.entity.Employee;
import com.aditi.employee.entity.JuniorEmployee;
import com.aditi.employee.entity.SeniorEmployee;
import com.aditi.employee.repository.EmployeeRepository;
import com.aditi.employee.repository.JuniorRepository;
import com.aditi.employee.repository.SeniorRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private SeniorRepository seniorRepository;
	
	@Autowired
	private JuniorRepository juniorRepository;
	

	public Employee getEmployee(String employeeName) {
		Employee employee = employeeRepository.findById(employeeName).get();
		return employee;
	}

	public void saveSeniorEmployee(Employee employee) {
		SeniorEmployee seniorEmployee = new SeniorEmployee(employee.getName(),employee.getAge());
		seniorRepository.save(seniorEmployee);
	}

	public void saveJuniorEmployee(Employee employee) {
		JuniorEmployee juniorEmployee = new JuniorEmployee(employee.getName(),employee.getAge());
		juniorRepository.save(juniorEmployee);		
	}
	
	
}
