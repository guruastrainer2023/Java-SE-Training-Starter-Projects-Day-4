package com.training.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

import com.training.bean.Circle;
import com.training.bean.Employee;
import com.training.bean.Gender;
import com.training.util.CustomCollector1;
import com.training.util.CustomCollector2;

public class Main1b {
	public static void main(String[] args) {
		
		List<Integer> integers;
		
		integers=IntStream.of(1,2,3,1,4,5,2)
					.boxed()
					.collect(CustomCollector2.unique());
		
		
		
		System.out.println(integers);
		
		
		
		
	}
}
