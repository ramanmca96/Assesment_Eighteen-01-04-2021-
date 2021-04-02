package com.StreamPrograms;

import java.util.function.BiFunction;

public class BiFunctionConcat {

	public static void main(String[] args) {
		
		BiFunction<String, String, String>str=(s1,s2)->s1.concat(s2);
		
		String apply = str.apply("Java", "SpringBoot");
		
		System.out.println("After Concat Two String:" +apply);
		
	}
}
