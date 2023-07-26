package com.training.ui;

import com.training.workers.CityPrintingThread;
import com.training.workers.CountryPrintingTask;

public class Main3 {

	public static void main(String[] args) {
		CountryPrintingTask countryPrintingTask=new CountryPrintingTask();
		
		Thread t1,t2;
		t2=new Thread(countryPrintingTask);
		//t1=new Thread(countryPrintingTask);
		
		CityPrintingThread cpt=new CityPrintingThread();
		cpt.start();

	}

}
