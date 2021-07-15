package com.aditi.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditi.employee.entity.SeniorEmployee;

public interface SeniorRepository extends JpaRepository<SeniorEmployee, String> {

}
