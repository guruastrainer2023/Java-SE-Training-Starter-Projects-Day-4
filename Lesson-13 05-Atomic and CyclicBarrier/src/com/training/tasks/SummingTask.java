package com.training.tasks;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;

public class SummingTask implements Runnable{
	
	int start;
	int end;
	CyclicBarrier cyclicBarrier;
	int total;
	
	public int getTotal() {
		return this.total;
	}
	

	public SummingTask(int start, int end, CyclicBarrier barrier) {
		super();
		this.start = start;
		this.end = end;
		this.cyclicBarrier=barrier;
	}



	@Override
	public void run()  {
		Integer sum=0;
		for(int i=start; i<=end; i++) {
			System.out.println(Thread.currentThread().getName()+ " Summing : "+ i);
			sum+=i;
			if(i==(end/2)) {
				
				try {
					System.out.println(Thread.currentThread().getName()+ " Waiting for other Threads to reach");
					this.cyclicBarrier.await();
					System.out.println(Thread.currentThread().getName()+ " has crossed the barrier....");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		this.total=sum;
	}

	

}
