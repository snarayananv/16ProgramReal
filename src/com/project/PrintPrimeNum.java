package com.project;

public class PrintPrimeNum {
	public static void main(String[] args) {
		int[] a = new int[7];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 11;
		a[4] = 13;
		a[5] = 15;
		a[6] = 22;
	
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a.length);
			for (int j = i+1; j <= i / 2; j++) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				if (i % j == 0) {
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println(a[0]);
			System.out.println(a[3]);
			System.out.println(a[4]);
		}
	}
}