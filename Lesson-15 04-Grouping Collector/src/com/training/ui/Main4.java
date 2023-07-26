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
import com.training.bean.Student;

public class Main4 {
	public static void main(String[] args) {
		
		List<Student> students=CollectionFactory.getStudentList();
		
		Long count=students.stream().count();
		System.out.println(count);
		
		Map<String, Long> depSummaryMap;
		
		depSummaryMap=students
						.stream()
						.collect(
							Collectors.groupingBy(
									Student::getDepartment, 
									Collectors.counting()
							)
						);
		
		System.out.println(depSummaryMap);
	}
}
