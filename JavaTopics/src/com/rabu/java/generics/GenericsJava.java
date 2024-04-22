package com.rabu.java.generics;

public class GenericsJava {

	public static void main(String[] args) {
		Test<Integer> obj = new Test<Integer>(10);
		System.out.println(obj.getObject());
		
		Test<String> obj1 = new Test<String>("rabu");
		System.out.println(obj1.getObject());
	}

}


class Test<T> {
	T obj;
	
	Test(T obj) {
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}

//Type Parameters in Java Generics
//The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:
//
//T – Type
//E – Element
//K – Key
//N – Number
//V – Value

//Generics doesn't work with primitive data types

//Advantages

//1.Code Reuse
//2.Type safety over using of Object class