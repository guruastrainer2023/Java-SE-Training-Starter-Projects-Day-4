package com.training.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;
import com.training.bean.Student;

public class Main6 {
	public static void main(String[] args) {
		
		List<Student> students=CollectionFactory.getStudentList();
		
		Map<String,Long> countMap;
		
		countMap=students
					.stream()
					.collect(
						Collectors.groupingBy(
							Student::getDepartment, Collectors.counting()	
						)	
					);
		
		
		System.out.println(countMap);
		
		Set<String> set;
		set=students
				.stream()
				.collect(
					Collectors.groupingBy(
						Student::getDepartment, Collectors.counting()	
					)	
				)
				.entrySet()
				.stream()
				.filter(
						e-> e.getValue()>1
				       )
				.map(Map.Entry::getKey)
				.collect(
						Collectors.toSet()
				);
		
		System.out.println(set);
		
	}
}
