package com.training.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

public class CustomCollector1 {

	public static <T> Collector<T, Set<T>, List<T>> unique(){
		return Collector.of(
					()-> new HashSet<T>(), 
					(result,item)-> result.add(item),
					(result1,result2)->{
						result1.addAll(result2);
						return result1;
					},
					(c)-> new ArrayList<T>(c),
					Collector.Characteristics.UNORDERED
					);
				
	}
}
