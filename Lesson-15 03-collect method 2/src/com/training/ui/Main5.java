package com.training.ui;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main5 {

	public static void main(String[] args) {
		
		//Mapping collector
		
		List<Employee> employees=CollectionFactory.getEmployeeList();
		
		Map<Gender, String> map;
		/*map=employees
				.stream()
				.collect(
						Collectors.toMap(
								(e)->e.getGender(), 
								(e)->e.getName())
				);
		*/
		//System.out.println(map);
		
		Map<Gender, String> map1;
		map1=employees
				.stream()
				.collect(
						Collectors.toMap(
								(e)->e.getGender(), 
								(e)->e.getName(),
								(a,b)-> a+ ":"+ b
								)
						
				);
		
		System.out.println(map1);
		

	}

}
