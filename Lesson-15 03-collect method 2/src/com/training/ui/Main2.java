package com.training.ui;

import java.util.List;
import java.util.stream.Collectors;

import com.training.bean.CollectionFactory;
import com.training.bean.Employee;

public class Main2 {

	public static void main(String[] args) {
		
		List<Employee> employees=CollectionFactory.getEmployeeList();
		
		List<Employee> list=employees
								.stream()
								.collect(Collectors.filtering(
										(e)->e.getBasicSalary()>15000, 
										Collectors.toList()));
		
		System.out.println(list);

	}

}
