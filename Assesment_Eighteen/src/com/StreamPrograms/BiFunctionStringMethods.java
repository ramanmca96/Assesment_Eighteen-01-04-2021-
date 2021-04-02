package com.StreamPrograms;

import java.util.function.BiFunction;

public class BiFunctionStringMethods {
 public static void main(String[] args) {
	BiFunction<String, String, Boolean> fun=(a,b)->a.equalsIgnoreCase(b);
	
	Boolean apply = fun.apply("WELCOME", "welcome");
	
	System.out.println("Given Two String are Equal:" +"  " +apply);
}
}
