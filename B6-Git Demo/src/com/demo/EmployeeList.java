package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Nayan", 20000, "Pune"));
		empList.add(new Employee(104, "Rohan", 75000, "Nashik"));
		empList.add(new Employee(103, "Pratik", 55000, "Mumbai"));
		empList.add(new Employee(109, "Aniket", 49000, "Delhi"));
		empList.add(new Employee(107, "Rohit", 68000, "Nagput"));

		System.out.println("before sorting>" +empList);
		
		
		Collections.sort(empList, new SalaryComparator());
		
		
		
		
		System.out.println("after sorting based on salary>>" +empList);
	}

}
