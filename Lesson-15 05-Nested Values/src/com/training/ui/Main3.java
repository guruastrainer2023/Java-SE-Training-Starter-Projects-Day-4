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
import com.training.bean.Skill;

public class Main3 {
	public static void main(String[] args) {
		
		List<Employee> employees=CollectionFactory.getEmployeeList();
		//System.out.println(employees);
	
		Map<String, List<Integer>> map;
		map=employees
				.stream()
				.collect(
					Collectors.flatMapping(
							(e)->e.getSkills().stream(), 
							Collectors.groupingBy(
								Skill::getSkillName,
								Collectors.mapping(
										Skill::getRatingOutOf10, 
										Collectors.toList())
								)
						 )
					);
				
		System.out.println(map);
		
		
		
		
		
		
	}
}
