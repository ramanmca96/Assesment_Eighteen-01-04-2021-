package com.StreamPrograms;

import java.util.function.BiFunction;

public class BiFunctionIntegerMethods {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer>be=(a,b)->a.max(50, 100);
		
		Integer apply = be.apply(50, 100);
		
		System.out.println(apply);
	}
}
