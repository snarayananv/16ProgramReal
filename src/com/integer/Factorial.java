package com.integer;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// int a = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter = ");
		int a = sc.nextInt();

		int fact = 1;
		while (a > 0) {
			fact = fact * a;
			a -= 1;

		}
		System.out.println(fact);
	}
}
