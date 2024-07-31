package com.java8Stream;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] value = {10,20,10,30,40,50,60,10,20,50};
		
		System.out.print("ENTER THE NUMBER : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		long count = Arrays.stream(value).filter(num->num==number).count();
		System.out.println(count);
	}

}
