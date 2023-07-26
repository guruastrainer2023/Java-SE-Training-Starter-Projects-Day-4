package com.training.util;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArraySpliterator implements Spliterator<String> {

	private String[] arrayToSplit;
	private int count = 0;
	private int from;
	private int to;
	
	private Spliterator<String> split;

	public ArraySpliterator(String[] arrayToSplit, int from, int to) {
		super();
		this.arrayToSplit = arrayToSplit;
		this.from=from;
		this.to=to;
	}

	
	
	public int getCount() {
		return count;
	}


	private int size() {
        return to - from;
    }

	@Override
	public boolean tryAdvance(Consumer<? super String> action) {
		if (size() > 0) {
            
            action.accept(this.arrayToSplit[from]);
            from++;
            return true;
        }
        return false;
	}

	@Override
	public Spliterator<String> trySplit() {
		 if (size() == 1) {
	         //   System.out.printf("split -> [%d-%d] not splitting because size is 1\n", from, to);
	            return null;
	        }
	        System.out.printf("split -> [%d-%d] -> [%d-%d], [%d-%d]\n", from, to, from, to-size()/2, from + size()/2, to);
	        Spliterator<String> other = new ArraySpliterator(this.arrayToSplit, from + size()/2, to);
	        this.to -= size()/2;
	        count++;
	        return other;
	}

	@Override
	public long estimateSize() {
		return arrayToSplit.length;
	}

	@Override
	public int characteristics() {
		return Arrays.asList(arrayToSplit).stream().spliterator().characteristics();
	}

}
