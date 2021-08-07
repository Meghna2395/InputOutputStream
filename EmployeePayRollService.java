package com.bridzelabz.employeepayrollservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {

	private List<EmployeePayRoll> employeePayrollList;

	public EmployeePayRollService() {
		this.employeePayrollList = new ArrayList<>();
	}

	public static void main(String[] args) {
		EmployeePayRollService employeePayRollService = new EmployeePayRollService();
		Scanner reader = new Scanner (System.in);
		employeePayRollService.readEmployeePayRoll(reader);
		employeePayRollService.writeEmployeePayRoll();

	}

	
	private void readEmployeePayRoll(Scanner reader) {
		System.out.println("Enter Employee ID:");
		int id = reader.nextInt();
		System.out.println("Enter Employee Name:");
		String name = reader.next();
		System.out.println("Enter Employee Salary:");
		double salary = reader.nextDouble();
		employeePayrollList.add(new EmployeePayRoll(id,name,salary));
	}
	
	private void writeEmployeePayRoll() {
		System.out.println("Enter your EmployeePayRoll" + employeePayrollList);

		
	}


}
