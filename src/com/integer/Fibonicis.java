package com.integer;

public class Fibonicis {
	public static void main(String[] args) {
		int first = 0, second = 1;
		int n = 10;
		for (int i = 1; i <= n; i++) {
			System.out.println(first);

			int next = first + second;
			first = second;
			second = next;

		}
		//System.out.println(first);
	}

}
