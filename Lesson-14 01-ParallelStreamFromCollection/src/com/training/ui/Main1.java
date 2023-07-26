package com.training.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main1 {
	public static void main(String[] args) {
		
		
		List<Circle> circleList=CollectionFactory.getCircleList();
		
		circleList.parallelStream().forEach((c)->{System.out.println(c.computeArea());});
		//circleList.forEach((c)->{System.out.println(c.computeArea());});
		
		
		
	}
}
