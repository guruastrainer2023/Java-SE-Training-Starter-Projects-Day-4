package com.training.ui;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Main3 {

	public static void main(String[] args) {
		List<String> wordList = Arrays.asList("Apple", "Banana", "Orange","Guava","Mango","Grapes");
		 
		//Getting spliterator1 and spliterator2 from Collection
		Spliterator<String> spliterator1 = wordList.spliterator();
		Spliterator<String> spliterator2 = spliterator1.trySplit();
 
		System.out.println("Traversing the first half of the spliterator..");
		spliterator1.forEachRemaining(System.out::println);
		System.out.println("Traversing the second half of the spliterator..");
		spliterator2.forEachRemaining(System.out::println);

	}

}
