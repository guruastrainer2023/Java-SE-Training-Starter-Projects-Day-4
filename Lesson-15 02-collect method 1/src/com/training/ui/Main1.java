package com.training.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main1 {
	public static void main(String[] args) {
		
		
		List<Employee> employees=CollectionFactory.getEmployeeList();
		
		List<Employee> list=employees
								.stream()
								.parallel()
								.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		
		System.out.println(list);
		
		
		
		
		
		
	}
}
