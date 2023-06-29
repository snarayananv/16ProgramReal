package com.project;

public class IntegerOccuerWithoutMap {
	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 3, 5, 2, 1, 6, 7, 3 };
		int[] n = new int[256];
		for (int i = 0; i < a.length; i++) {
			int t = a[i];
			n[t]++;

		}
		for (int i = 0; i < 256; i++) {
			if (n[i] != 0) {
				System.out.println((int) i + " " + n[i]);
			}

		}
	}

}
