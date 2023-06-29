package com.integer;

public class PrintStar {
	public static void main(String[] args) {
		System.out.println("Star Order");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Star Order");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("Numer Order");
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
		System.out.println("Numer Order 1");
		int n = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(n++);
			}
			System.out.println();
		}

	}
}
