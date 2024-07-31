package com.java8Stream;

import java.util.List;
import java.util.Optional;

public class CheckListIsEmptyOrNot {

	public static void main(String[] args) {
		 
		List<String> list = null;
		Optional<List<String>> optionalList = Optional.ofNullable(list);
		optionalList.ifPresent(i->i.stream().forEach(System.out::println));
	}

}
