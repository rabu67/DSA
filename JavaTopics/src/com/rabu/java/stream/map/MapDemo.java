package com.rabu.java.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("John", "Mathew", "Beast", "Turner", "Warner");
		
		//changing words into upperCase
		words.stream().map(word -> word.toUpperCase()).forEach(System.out::println);
		
		System.out.println();
		
		List<Employee> emp = Arrays.asList(
				new Employee(00, "John", 10000),
				new Employee(01, "Mathew", 20000),
				new Employee(02, "Beast", 30000),
				new Employee(03, "Turner", 40000),
				new Employee(03, "Warner", 50000)
				);
		//printing emp having salary of gt 20000
		emp.stream().filter(e -> e.salary > 20000).map(e -> e.name.toUpperCase()).forEach(System.out::println);
		List<String> result = emp.stream().filter(e -> e.salary > 20000).map(e -> e.name.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(result);
		
	}

}


class Employee {
	public int id;
	public String name;
	public int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
}
