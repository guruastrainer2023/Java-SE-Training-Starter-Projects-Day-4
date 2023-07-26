package com.training.tasks;

public class RangedNumberPrintingTask implements Runnable{
	
	int start; //10
	int end;   //20
	
	
	

	public RangedNumberPrintingTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}




	@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			System.out.println(Thread.currentThread().getName()+ " : "+ i);
		}
	}

}
