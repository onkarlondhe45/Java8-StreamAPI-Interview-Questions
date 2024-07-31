package com.java8Stream;

import java.util.Arrays;
import java.util.List;

public class FindEvenAndOld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = Arrays.asList(10,20,5,4,30,12,9,7,13,15);

		System.out.println("Event Elements");
		nums.stream().filter(num->num%2==0).forEach(System.out::println);
		System.out.println("Odd Elements");
		nums.stream().filter(num->num%2!=0).forEach(System.out::println);
	}

}
