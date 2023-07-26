package com.training.ui;

import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.training.util.ArraySpliterator;

public class Main3 {

	public static void main(String[] args) {
		String[] stringArray = new String[100];

		for (int i = 0; i < stringArray.length; i++) {
			if (i % 2 == 0) {
				stringArray[i] = "Basics";
			} else {
				stringArray[i] = "Strong";
			}
		}
		ArraySpliterator mySpliterator = new ArraySpliterator(stringArray,0, stringArray.length-1);
		Stream<String> myStream = StreamSupport.stream(mySpliterator, true);
		
		myStream.forEach((e)-> 
					{
						System.out.println(Thread.currentThread().getName()+ " : "+ e);
					}
				);
		System.out.println(mySpliterator.getCount());
	}

}
