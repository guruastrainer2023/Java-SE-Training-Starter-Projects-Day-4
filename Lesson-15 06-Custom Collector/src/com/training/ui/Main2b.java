package com.training.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;
import com.training.util.CustomCollector1;
import com.training.util.CustomCollector2;
import com.training.util.CustomCollector3;

public class Main2b {
	public static void main(String[] args) {
		
		List<Circle> circles=CollectionFactory.getCircleList();
		
		List<Circle> circles1=circles.stream().collect(new CustomCollector3<>());
		
		System.out.println(circles1);
		
		
		
		
	}
}
