package com.rabu.java.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatMapDemo {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 25);
		List<Integer> list2 = Arrays.asList(100, 200, 300, 400, 15);
		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
		
		List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);
		
		finalList.stream().flatMap(list -> list.stream()).forEach(System.out::println);
		
		finalList.stream().flatMap(list -> list.stream()).filter(x -> x%2 == 1).map(x -> x+100).forEach(System.out::println);
		
		List<Integer> result = finalList.stream().flatMap(list -> list.stream()).filter(x -> x%2 == 1).map(x -> x+100).collect(Collectors.toList());
		
		System.out.println(result);
		
		
		//int streams
		List<String> list4 = Arrays.asList("100", "200", "300", "400");
		
		list4.stream().flatMapToInt(list -> IntStream.of(Integer.parseInt(list))).forEach(System.out::println);
		
	}

}
