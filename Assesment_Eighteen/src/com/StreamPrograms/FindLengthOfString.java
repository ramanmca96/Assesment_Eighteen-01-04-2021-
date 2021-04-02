package com.StreamPrograms;

import java.util.function.Function;

public class FindLengthOfString {

	public static void main(String[] args) {

		Function<String, Integer>str=s->s.length();
		
		System.out.println(str.apply("SRIRANGAM"));
		}
}
