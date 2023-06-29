package com.array;

public class ArrayRemovDupliWithoutUseSet {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 3, 4, 1, 5, 6, 6 };
		int[] n = new int[256];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int p = a[i];
					a[i] = a[j];
					a[j] = p;
				}
			}
			int t = a[i];
			n[t]++;
		}
		for (int k = 0; k < 256; k++) {
			if (n[k] != 0) {
				System.out.println((int) k);
			}
		}
	}
}
