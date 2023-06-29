package com.array;

public class ArrayPrintOrder {

	public static void main(String[] args) {

		int[] a = new int[7];

		a[0] = 1;
		a[1] = 5;
		a[2] = 3;
		a[3] = 4;
		a[4] = 2;
		a[5] = 7;
		a[6] = 6;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int tem = a[i];
					a[i] = a[j];
					a[j] = tem;
				}
			}
			System.out.print("" + a[i]);

		}
		System.out.println("\n" + a[0]);

	}
}
