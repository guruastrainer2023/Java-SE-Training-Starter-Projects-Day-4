package com.training.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CustomCollector3<T> implements Collector<T, Set<T>, List<T>>{

	

	@Override
	public Supplier<Set<T>> supplier() {
		return HashSet::new;
	}

	@Override
	public BiConsumer<Set<T>, T> accumulator() {
		return (result,item)-> result.add(item);
	}

	@Override
	public BinaryOperator<Set<T>> combiner() {
		return (result1, result2)->{
			result1.addAll(result2);
			return result1;
		};
	}

	@Override
	public Function<Set<T>, List<T>> finisher() {
		return (c)-> new ArrayList<>(c);
	}

	@Override
	public Set<Characteristics> characteristics() {
		Set<Characteristics> set=new HashSet<>();
		set.add(Characteristics.UNORDERED);
		return set;
	}

}
