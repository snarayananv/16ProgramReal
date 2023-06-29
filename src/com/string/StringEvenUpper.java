package com.string;

public class StringEvenUpper {

	public static void main(String[] args) {

		String s = "Welcome to java hello sn";
		String[] split = s.split(" ");

		for (int i = 0; i < split.length; i++) {
			String spa = split[i];
			System.out.print(spa);

		}

	}
}
