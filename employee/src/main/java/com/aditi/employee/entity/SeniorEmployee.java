package com.aditi.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "senior")
public class SeniorEmployee {

	@Id
	@Column(name = "name")
	String seniorName;
	
	@Column(name = "age")
	int seniorAge;
	
	public SeniorEmployee() {}

	public SeniorEmployee(String seniorName, int seniorAge) {
		this.seniorName = seniorName;
		this.seniorAge = seniorAge;
	}



	public String getSeniorName() {
		return seniorName;
	}

	public void setSeniorName(String seniorName) {
		this.seniorName = seniorName;
	}

	public int getSeniorAge() {
		return seniorAge;
	}

	public void setSeniorAge(int seniorAge) {
		this.seniorAge = seniorAge;
	}

	@Override
	public String toString() {
		return "SeniorEmployee [seniorName=" + seniorName + ", seniorAge=" + seniorAge + "]";
	}
	
	
}
