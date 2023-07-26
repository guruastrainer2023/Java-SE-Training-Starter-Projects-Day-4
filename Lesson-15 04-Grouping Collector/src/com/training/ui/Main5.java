package com.training.ui;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;
import com.training.bean.Student;

public class Main5 {
	public static void main(String[] args) {
		
		List<Student> students=CollectionFactory.getStudentList();
		
		Map<String, Optional<Student>> highestByDepartment;
		
		highestByDepartment=
				students
					.stream()
					.collect(
						Collectors.groupingBy(
								Student::getDepartment,
								Collectors.maxBy(
										Comparator.comparing(Student::getAverageMark)
										)
								)	
					);
		
		System.out.println(highestByDepartment);
		
		highestByDepartment.forEach(
					(k,v)->{
						System.out.print(k + " : ");
						System.out.println(v.isPresent()? v.get().getName()+ " - "+ v.get().getAverageMark(): "No Highest Found");
						
					}
				);
		
		
	}
}
