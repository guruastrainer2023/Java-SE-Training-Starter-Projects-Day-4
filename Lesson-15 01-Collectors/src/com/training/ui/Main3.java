package com.training.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main3 {
	public static void main(String[] args) {
		
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		Map<Character, List<Employee>> gradedEmployeeMap;
		gradedEmployeeMap=employeeList.stream().collect(Collectors.groupingBy(Employee::getGrade));
		
		System.out.println(gradedEmployeeMap);
		
		
		
		
		
		
		
		
	}
}
