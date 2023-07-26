package com.training.ui;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main4 {

	public static void main(String[] args) {
		
		//Mapping collector
		
		List<Employee> employees=CollectionFactory.getEmployeeList();
		
		List<String> nameList;
		nameList=employees
					.stream()
					.collect(
							Collectors.mapping(
									Employee::getName,
									Collectors.toList())
							);
		
		System.out.println(nameList);
		
		List<String> nameSalaryList;
		nameSalaryList=employees
					.stream()
					.collect(
							Collectors.mapping(
									(e)-> e.getName()+" - "+e.getBasicSalary(),
									Collectors.toList())
							);
		
		System.out.println(nameSalaryList);

	}

}
