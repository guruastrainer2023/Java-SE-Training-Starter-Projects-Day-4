package com.training.bean;

public class ThreadInfo {

	public static void printCurrentThreadName(){
		String str=Thread.currentThread().getName();
		System.out.print("\n[ "+ str+ " \t]\t ->");
	}
}
