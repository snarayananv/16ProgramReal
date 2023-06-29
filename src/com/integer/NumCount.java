package com.integer;

public class NumCount {

	public static void main(String[] args) {
		int num = 2345765;
		int count = 0;

		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println(count);

		int nu = 234;
		int sum = 0;
		while (nu > 0) {
			int rem = nu % 10;
			sum = sum + rem;
			nu = nu / 10;
		}
		System.out.println(sum);
	}
}
