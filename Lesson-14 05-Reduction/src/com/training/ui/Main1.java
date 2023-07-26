package com.training.ui;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.stream.IntStream;

import com.training.bean.Circle;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main1 {
	public static void main(String[] args) {
		
		int r1=IntStream.rangeClosed(1, 10)
				.parallel()
				.reduce(0, (sum,element)-> sum+element);
		
		
		System.out.println(r1);
		
		
		
		
		
	}
}
