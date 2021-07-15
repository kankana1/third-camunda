package com.aditi.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditi.employee.entity.JuniorEmployee;

public interface JuniorRepository extends JpaRepository<JuniorEmployee, String> {

}
