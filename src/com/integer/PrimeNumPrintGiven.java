package com.integer;

public class PrimeNumPrintGiven {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 11, 13, 15, 18, 17 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 2; j <= a[i] / 2; j++) {
				if (a[i] % j == 0) {
					count++;
				}

			}
			if (count == 0) {
				System.out.println(a[i]);
			}
		}

	}

}
