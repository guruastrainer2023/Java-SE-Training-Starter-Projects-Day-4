package com.training.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main1 {
	public static void main(String[] args) {
		
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		double r1=employeeList
					.stream()
					.filter((e)-> e.getGender()==Gender.MALE)
					.mapToDouble((e)->e.getNetSalary())
					.sequential()
					.sum();
		System.out.println("\n "+r1);

		double r2=employeeList
				.stream()
				.filter((e)-> e.getGender()==Gender.MALE)
				.mapToDouble((e)->e.getNetSalary())
				.parallel()
				.sum();
		
		System.out.println("\n" + r2);
		
		
		
		
		
		
		
	}
}
