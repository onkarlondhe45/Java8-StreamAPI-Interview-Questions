package com.java8Stream;

import java.util.Random;
import java.util.stream.Stream;

public class Print10RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		Stream.generate(random::nextInt).limit(10).forEach(System.out::println);
	}

}
