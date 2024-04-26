package com.rabu.java.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethods {

	public static void main(String[] args) {

		List<String> vehicles = Arrays.asList("Bus", "Train", "Bike", "Car", "Bus", "Flight", "Bike");

		// print distince value
		vehicles.stream().distinct().forEach(System.out::println);

		// count
		long count = vehicles.stream().count();
		System.out.println(count);

		// limit
		vehicles.stream().limit(1).forEach(System.out::println);

		Object[] array = vehicles.stream().toArray();

		for (Object arr : array) {
			System.out.println(arr);
		}

		List<Integer> nums = Arrays.asList(10, 4, 6, 3, 2, 89);

		Optional<Integer> min = nums.stream().min((v1, v2) -> {
			return v1.compareTo(v2);
		});

		System.out.println("Min val --> " + min.get());

		Optional<Integer> max = nums.stream().max((v1, v2) -> {
			return v1.compareTo(v2);
		});

		System.out.println("Max val --> " + max.get());
	}

}
