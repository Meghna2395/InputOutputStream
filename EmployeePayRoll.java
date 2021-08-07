package com.bridzelabz.employeepayrollservice;

public class EmployeePayRoll {
     int id;
     String name;
     double salary;
	public EmployeePayRoll(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeePayRoll [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
     
     
}
