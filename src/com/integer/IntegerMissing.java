package com.integer;

public class IntegerMissing {
	public static void main(String[] args) {
		int[] ar = { 2, 4, 5, 1, 3, 7 };

		int sum = (ar.length + 1) * (ar.length + 2) / 2;
		for (int j = 0; j < ar.length; j++) {
			sum -= ar[j];
		}
		System.out.println(sum);

	}

}
