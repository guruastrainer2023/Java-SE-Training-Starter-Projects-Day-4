package com.training.ui;

import com.training.workers.CityPrintingThread;
import com.training.workers.CountryPrintingTask;

public class Main1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Begins");
		
		Thread t=Thread.currentThread();
		
		Thread t1=new CityPrintingThread();
		t1.setName("City Printing Thread");
		t1.start();
		
		CountryPrintingTask countryPrintingTask=new CountryPrintingTask();
		Thread t2=new Thread(countryPrintingTask);
		t2.setName("Country PT");
		t2.start();
		
		
		
		
		for(int i=1;i<=10; i++) {
			System.out.println(t.getName()+" : "+i);
			t.sleep(2000);
		}
		System.out.println("Program Ends");
	}
}
