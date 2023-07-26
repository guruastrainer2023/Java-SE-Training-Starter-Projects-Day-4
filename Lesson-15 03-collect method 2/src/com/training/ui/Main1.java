package com.training.ui;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main1 {
	public static void main(String[] args) {
		
		List<Employee> employees=CollectionFactory.getEmployeeList();
		
		List<Employee> list=employees
								.stream()
								.collect(Collectors.toList());
		
		System.out.println(list);
		
		Optional<Employee> optionalResult;
		optionalResult= employees
							.stream()
							.collect(Collectors.maxBy(Comparator.comparing(Employee::getBasicSalary)));
		
		System.out.println(optionalResult.get());
		
		employees
		.stream()
		.collect(Collectors.maxBy(Comparator.comparing(Employee::getBasicSalary)))
		.ifPresentOrElse(
				(e)-> System.out.println(e.getName()+ " is the Highest Paid"),
				()->{System.out.println("Highest Paid Employee Not Found");});
		
		
		
		
		
		
	}
}
