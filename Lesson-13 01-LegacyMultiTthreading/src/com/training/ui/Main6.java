package com.training.ui;

import com.training.workers.CityPrintingThread;

public class Main6 {

	public static void main(String[] args) {
		CityPrintingThread cityPrintingThread=new CityPrintingThread();
		cityPrintingThread.start();
		
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}

	}

}
