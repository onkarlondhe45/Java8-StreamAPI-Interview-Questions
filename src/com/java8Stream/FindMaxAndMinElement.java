package com.java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxAndMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(10,20,5,14,7,25,38);
		
		Optional<Integer> max = list.stream().max(Integer::compareTo);
		Optional<Integer> min = list.stream().min(Integer::compareTo);
		System.out.println(max);
		System.out.println(min);
	}

}
