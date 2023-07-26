package com.training.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main1 {
	public static void main(String[] args) {
		
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		Optional<Employee> optionalResult1=employeeList
											.stream()
											.sequential()
											.filter((e)-> e.getGender()==Gender.MALE)
											
											.findAny();
		
		
		
		Optional<Employee> optionalResult2=employeeList
				.stream()
				.parallel()
				.filter((e)-> e.getGender()==Gender.MALE)
				
				.findAny();
		
		System.out.println(optionalResult1.get());
		System.out.println(optionalResult2.get());

		
		
		
	}
}
