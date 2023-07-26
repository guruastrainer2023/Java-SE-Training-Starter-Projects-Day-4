package com.training.tasks;

import java.util.concurrent.Callable;

public class RangedNumberSummingTask implements Callable<Integer>{
	
	int start; //10
	int end;   //20
	

	public RangedNumberSummingTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}


	@Override
	public Integer call() throws Exception {
		Integer sum=0;
		for(int i=start; i< end; i++) {
			sum=sum+i;
		}
		return sum;
	}

	
}
