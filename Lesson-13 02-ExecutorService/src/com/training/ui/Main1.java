package com.training.ui;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.training.tasks.RangedNumberPrintingTask;
import com.training.workers.CityPrintingThread;
import com.training.workers.CountryPrintingTask;

public class Main1 {
	public static void main(String[] args){
		
		RangedNumberPrintingTask task=new RangedNumberPrintingTask(1, 10);
		
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(task);
		es.execute(task);
		es.shutdown();
	}
}
