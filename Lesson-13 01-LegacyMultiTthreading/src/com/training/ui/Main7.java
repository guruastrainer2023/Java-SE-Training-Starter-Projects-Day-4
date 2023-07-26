package com.training.ui;

import com.training.tasks.DummyRunnable;

public class Main7 {

	public static void main(String[] args) {
		DummyRunnable dummyRunnable=new DummyRunnable();
		
		Thread t1=new Thread(dummyRunnable);
		t1.start();
		
		Thread t2=new Thread(dummyRunnable);
		t2.start();

	}

}
