package com.java8Stream;

import java.util.stream.Stream;

public class ConcatenateTwoStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> num1 = Stream.of(1,2,3);
		Stream<Integer> num2 = Stream.of(6,5,4);
		Stream.concat(num1, num2).forEach(System.out::println);
	}

}
