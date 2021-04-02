package com.StreamPrograms;

import java.util.function.Function;
import java.util.function.Predicate;


public class OddorEven {
	public static void main(String[] args) {

		int a[] = { 20, 30, 40, 50, 60, 70, 80, 90 };

		Predicate<Integer> pro1 = i -> i % 2 == 0;
		
		System.out.println("Given Number Even Numbers Are:");
		for (int j : a) {

			if (pro1.test(j))

			{
				System.out.println(j);
			}
		}
}
}