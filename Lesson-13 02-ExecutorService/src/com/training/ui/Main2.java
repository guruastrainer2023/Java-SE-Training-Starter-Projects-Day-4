package com.training.ui;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.training.tasks.RangedNumberSummingTask;
import com.training.workers.CityPrintingThread;

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es=Executors.newFixedThreadPool(3);
		
		RangedNumberSummingTask task=new RangedNumberSummingTask(1, 10);
		
		Future<Integer> future=es.submit(task);
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			
			e.printStackTrace();
		}
		
		es.shutdown();
	}

}
