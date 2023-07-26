package com.training.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;
import com.training.bean.Skill;

public class Main1 {
	public static void main(String[] args) {
		
		List<Employee> employees=CollectionFactory.getEmployeeList();
		//System.out.println(employees);
	
		List<List<Skill>> skills;
		skills=employees
					.stream()
					.collect(
							Collectors.mapping(
									Employee::getSkills, 
									Collectors.toList())
					);
		
		System.out.println(skills);
		
		
		
		
		
		
	}
}
