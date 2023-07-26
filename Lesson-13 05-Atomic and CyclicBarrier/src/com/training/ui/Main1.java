package com.training.ui;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;


import com.training.tasks.SummingTask;

public class Main1 {
	
	private static int testTotal() {
		int sum=0;
		for(int i=1; i<=200; i++)
			sum+=i;
		return sum;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CyclicBarrier cb=new CyclicBarrier(2);
		
		SummingTask task1=new SummingTask(1, 50, cb);
		SummingTask task2=new SummingTask(51, 200,cb);
		//SummingTask task3=new SummingTask(201, 400,cb);
		
		Thread t1=new Thread(task1, "T1");
		
		Thread t2=new Thread(task2, "T2");
		
		//Thread t3=new Thread(task3, "T3");
		
		t1.start();
		t2.start();
		//t3.start();
		
		t1.join();
		t2.join();
		//t3.join();
		System.out.println(Thread.currentThread().getName() + " : "+(task1.getTotal()+ task2.getTotal()));
		
		int s1=testTotal();
		int s2=task1.getTotal()+ task2.getTotal();
		System.out.println(Thread.currentThread().getName() + " : "+ (s1==s2));
		
	}

}
