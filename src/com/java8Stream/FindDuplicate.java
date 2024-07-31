package com.java8Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = Arrays.asList(10,20,30,20,5,15,12,15);
		
		HashSet<Integer> set = new HashSet<>();
		
		nums.stream().filter(num->!set.add(num)).forEach(System.out::println);
		
	}

}
