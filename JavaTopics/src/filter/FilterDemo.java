package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,15,17,20,25,27,30);
		
		// filter the odd value
		List<Integer> result = nums.stream().filter(n -> n%2 == 1).collect(Collectors.toList());
		
		System.out.println(result);
		
		//print the odd value
		nums.stream().filter(n -> n%2 == 0).forEach(System.out::println);
		
		List<String> names = Arrays.asList("John", "Doe", "Micheal", "Sanga", "Mathew", "Robinson");
		
		//filter the names using length
		List<String> WordResult = names.stream().filter(word -> word.length() > 5 && word.length() < 8).collect(Collectors.toList());
		
		//printing the names
		System.out.println(WordResult);
		
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(0, "Trimmer", 700));
		productList.add(new Product(1, "Charger", 300));
		productList.add(new Product(2, "Mouse", 500));
		productList.add(new Product(3, "Headphones", 1100));
		
		//printing the product which price is gt than 500
		List<Product> productResult = productList.stream().filter(product -> product.price > 500).collect(Collectors.toList());
		
		productResult.forEach(n -> System.out.println(n.name));
		
	}

}


class Product {
	
	public int id;
	public String name;
	public int price;
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}
