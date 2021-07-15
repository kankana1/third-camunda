package com.aditi.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "junior")
public class JuniorEmployee {

	@Id
	@Column(name = "name")
	String juniorName;
	
	@Column(name = "age")
	int juniorAge;
	
	public JuniorEmployee() {}

	public JuniorEmployee(String juniorName, int juniorAge) {
		this.juniorName = juniorName;
		this.juniorAge = juniorAge;
	}

	public String getJuniorName() {
		return juniorName;
	}

	public void setJuniorName(String juniorName) {
		this.juniorName = juniorName;
	}

	public int getJuniorAge() {
		return juniorAge;
	}

	public void setJuniorAge(int juniorAge) {
		this.juniorAge = juniorAge;
	}

	@Override
	public String toString() {
		return "JuniorEmployee [juniorName=" + juniorName + ", juniorAge=" + juniorAge + "]";
	}
	
	
}
