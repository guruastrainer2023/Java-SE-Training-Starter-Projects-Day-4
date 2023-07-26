package com.training.ui;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;
import com.training.bean.Skill;

public class Main4 {
	public static void main(String[] args) {
		
		List<Employee> employees=CollectionFactory.getEmployeeList();
		
		Map<String, Integer> map;
		
		map=employees
				.stream()
				.collect(
					Collectors.groupingBy(
							Employee::getName,
							Collectors.flatMapping(
									(e)-> e.getSkills().stream(), 
									Collectors.summingInt(
											(o)-> o.getRatingOutOf10()
											)
									)
							)
							
							
				);
		
		System.out.println(map);
		
		map
		.entrySet()
		.stream()
		.sorted(Comparator.comparing(Map.Entry::getValue))
		.forEach(System.out::println);
		
		
		
		
	}
}
