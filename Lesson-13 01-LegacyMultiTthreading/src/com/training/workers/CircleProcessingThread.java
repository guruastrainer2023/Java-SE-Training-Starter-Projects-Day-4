package com.training.workers;

import com.training.bean.Circle;

public class CircleProcessingThread extends Thread{
	@Override
	public void run() {
		Circle circle=new Circle(25);
		System.out.println(Thread.currentThread().getName()+" "+ circle.computeArea());
	}
}
