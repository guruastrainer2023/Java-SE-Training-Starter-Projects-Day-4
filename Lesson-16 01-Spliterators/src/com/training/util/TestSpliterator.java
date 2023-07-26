package com.training.util;

import java.util.Spliterator;
import java.util.function.LongConsumer;

public class TestSpliterator implements Spliterator.OfLong{

	public static Integer splitNum=Integer.valueOf(1);
	private Spliterator.OfLong split;
	
	
	
	public TestSpliterator(OfLong split) {
		super();
		this.split = split;
	}

	@Override
	public long estimateSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int characteristics() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public OfLong trySplit() {
		splitNum++;
		return this.split.trySplit();
		
	}

	@Override
	public boolean tryAdvance(LongConsumer action) {
		 return this.split.tryAdvance(action);
	}

}
