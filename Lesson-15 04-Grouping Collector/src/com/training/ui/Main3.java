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

public class Main3 {
	public static void main(String[] args) {
		
		List<Student> students=CollectionFactory.getStudentList();
		//System.out.println(students);
	
		Map<String, List<String>> depMap;
		
		/*depMap=students
				.stream()
				.collect(Collectors.groupingBy(
						Student::getDepartment,
						Collectors.mapping((s)-> s.getName()),
						Collectors.toList()
						
						
						));
		*/
		//System.out.println(depMap);
		
		
		
		
	}
}
