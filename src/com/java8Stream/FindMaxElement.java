package com.java8Stream;

import java.util.Arrays;

public class FindMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {20,40,60,80,100};
		Arrays.stream(nums).max().ifPresent(System.out::println);
	}

}
