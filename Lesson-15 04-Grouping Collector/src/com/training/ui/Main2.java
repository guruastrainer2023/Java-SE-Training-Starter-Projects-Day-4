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

public class Main2 {
	public static void main(String[] args) {
		
		List<Student> students=CollectionFactory.getStudentList();
		//System.out.println(students);
	
		students
			.stream()
			.map((s)-> s.getName()+" : "+s.getAverageMark())
			.collect(
					Collectors.toList()
			)
			.forEach((e)-> System.out.println(e));
		
		System.out.println("----------------------------------------------------");
		students
			.stream()
			.collect(
					Collectors.mapping(
							(s)-> s.getName()+" : "+ s.getAverageMark(), 
							Collectors.toList())
			)
			.forEach((s)-> System.out.println(s));
		
		
	}
}
