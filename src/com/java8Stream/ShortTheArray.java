package com.java8Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShortTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ascending Order
		List<Integer> list = Arrays.asList(2,1,5,4,6,3,8);
		System.out.println("list in ascending order");
		list.stream().sorted().forEach(System.out::println);
		
		//Descending Order
		System.out.println("list in descending order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
