package com.java8Stream;

import java.util.Arrays;
import java.util.List;

public class FindTotalElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = Arrays.asList(10,20,5,4,30,12);
		
		long count = nums.stream().count();
		System.out.println(count);
		
	}

}
