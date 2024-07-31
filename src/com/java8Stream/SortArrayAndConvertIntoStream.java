package com.java8Stream;

import java.util.Arrays;

public class SortArrayAndConvertIntoStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {10,50,5,2,9,15};
		Arrays.sort(nums);
		Arrays.stream(nums).forEach(System.out::println);
	}

}
