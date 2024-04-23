package com.rabu.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(2,5,4,3,7,8);	
		
		Integer reduce = nums.stream()
				.filter(n -> n%2 == 1)
				.sorted()
				.map(n -> n*2)
				.reduce(0, (c,e) -> c+e);
		
		System.out.println(reduce);
		
		Stream<Integer> stream = nums.stream();
		
		
		stream.forEach(n -> System.out.println(n));
		//stream.forEach(n -> System.out.println(n));
	}

}


// stream can't be consumer or operated more than once - line no 25
// filter internally uses predicate logic where it will return true/false
// map takes the input and performs the logic
// reduce helps to consolidate the result into one which takes accumulator and (carry (c) and new elements(e)) to perform the operations

// line no 13 having 3 streams returned, which doesn't mean it will duplicate but it will be replaced by other streams while proceeding to next operation

