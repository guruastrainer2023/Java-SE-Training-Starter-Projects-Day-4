package com.training.ui;

import java.util.List;
import java.util.Spliterator;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.ThreadInfo;

public class Main4 {

	public static void main(String[] args) {
		
		List<Circle> circles=CollectionFactory.getCircleList();
		
		Spliterator<Circle> spliterator1=circles.spliterator();
		Spliterator<Circle> spliterator2=spliterator1.trySplit();
		
		spliterator1.forEachRemaining(
					(e)->{
						ThreadInfo.printCurrentThreadName();
						System.out.println(e);
					}
				);
		System.out.println("---------------------------------------");
		spliterator2.forEachRemaining(
				(e)->{
					ThreadInfo.printCurrentThreadName();
					System.out.println(e);
				}
			);
	}

}
