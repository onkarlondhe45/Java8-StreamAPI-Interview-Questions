package com.java8Stream;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(10,20,5,4,30,12);
		
		nums.stream().findFirst().ifPresent(System.out::println);
		
	}

}
