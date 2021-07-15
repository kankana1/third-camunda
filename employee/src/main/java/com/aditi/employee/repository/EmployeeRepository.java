package com.aditi.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditi.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
