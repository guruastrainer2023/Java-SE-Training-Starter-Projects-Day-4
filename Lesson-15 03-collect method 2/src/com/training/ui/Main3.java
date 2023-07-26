package com.training.ui;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main3 {

	public static void main(String[] args) {
		
		// Grouping By Collector
		
		List<Employee> employees=CollectionFactory.getEmployeeList();
		
		Map<Gender, List<Employee>> map;
		map=employees
				.stream()
				.collect(
						Collectors.groupingBy(
								Employee::getGender,
								Collectors.toList())
				);
		
		System.out.println(map);

	}

}
