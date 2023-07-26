package com.training.ui;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.stream.LongStream;
import java.util.stream.StreamSupport;

import com.training.bean.Circle;
import com.training.bean.Employee;
import com.training.bean.Gender;
import com.training.util.TestSpliterator;

public class Main2 {
	
	private static boolean isPrime(long n) {
		return LongStream.rangeClosed(2, (long)Math.sqrt(n))
				.noneMatch(divisor -> n%divisor==0);
	}
	
	private static void getNumPrimes(long begin, long end) {
		LongStream longStream=
				StreamSupport.longStream(
						LongStream.range(begin,end).spliterator(),
						true).filter((i)-> isPrime(i));
				
		System.out.println("Number of Primes : " +longStream.count());
	}
	
	
	public static void main(String[] args) {
		
		
		long begin =10000000;
		long window=10000000;
		
		getNumPrimes(begin, begin+window);
		
		System.out.println("Number of Splits :" + TestSpliterator.splitNum);
		
		
		
		
	}
}
