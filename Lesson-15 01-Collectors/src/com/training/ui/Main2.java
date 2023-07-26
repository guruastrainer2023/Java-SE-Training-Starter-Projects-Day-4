package com.training.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main2 {
	public static void main(String[] args) {
		
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		List<Employee> list1=employeeList
						.stream()
						.filter((e)-> e.getGrade()=='A')
						.collect(Collectors.toList());
		
		List<Employee> list2=employeeList
				.stream()
				.filter((e)-> e.getGrade()=='B')
				.collect(Collectors.toList());
		
		List<Employee> list3=employeeList
				.stream()
				.filter((e)-> e.getGrade()=='C')
				.collect(Collectors.toList());
		
		System.out.println(employeeList);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		
		
		
		
		
	}
}
