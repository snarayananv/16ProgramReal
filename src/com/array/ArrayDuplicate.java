package com.array;

public class ArrayDuplicate {
	public static void main(String[] args) {
		int[] a = new int[7];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 2;
		a[5] = 3;
		a[6] = 5;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Dup == " + a[i]);

				}
			}

		}
	}
}
