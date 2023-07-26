package com.training.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main1 {
	public static void main(String[] args) {
		
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		List<Employee> list1=employeeList
								.stream()
								.collect(Collectors.toList());
		
		System.out.println(employeeList);
		System.out.println(list1);
		
		
		
		
		
		
	}
}
