package com.java8Stream;

import java.util.Arrays;

public class ArrayContainDuplicateValueOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1,2,3,4,5,6,1};
		if(Arrays.stream(numbers).distinct().count()!=numbers.length) {
			System.out.println("Array contains duplicate integer");
		}else {
			System.out.println("Array constains unique integer");
		}
	}

}
