package com.training.ui;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.stream.LongStream;

import com.training.bean.Circle;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main1 {
	
	private static boolean isPrime(long n) {
		return LongStream.rangeClosed(2, (long)Math.sqrt(n))
				.noneMatch(divisor -> n%divisor==0);
	}
	
	private static void getNumPrimes(long begin, long end) {
		LongStream longStream=LongStream.range(begin, end).filter(i-> isPrime(i));
		System.out.println("Number of Primes : " +longStream.count());
	}
	
	
	public static void main(String[] args) {
		
		
		long begin =10000000;
		long window=100000;
		
		getNumPrimes(begin, begin+window);
		
		
		
		
		
		
	}
}
