package com.java8Stream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String format = dateTimeFormatter.format(localDateTime);
		System.out.println(format);
	}

}
