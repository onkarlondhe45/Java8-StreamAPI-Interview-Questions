package com.java8Stream;

import java.util.Arrays;
import java.util.List;

public class ConvertWordIntoUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> str = Arrays.asList("Onkar","Kishor","Aniket","Mukund");
		str.stream().map(st->st.toUpperCase()).forEach(System.out::println);
		
	}

}
