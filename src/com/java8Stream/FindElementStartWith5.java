package com.java8Stream;

import java.util.Arrays;
import java.util.List;

public class FindElementStartWith5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = Arrays.asList(10,11,5,15,51,54);
		nums.stream().filter(num->num.toString().startsWith("5")).forEach(System.out::println);
		
	}

}
