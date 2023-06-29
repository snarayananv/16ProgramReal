package com.project;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		//int a = 153;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter= ");
		int a=sc.nextInt();
		int arm = 0, tem = a, rem = 0;
		while (a > 0) {
			rem = a % 10;
			arm = arm + (rem * rem * rem);
			a = a / 10;
		}
		System.out.println(arm);

		if (tem == arm) {
			System.out.println("arm");
		} else {
			System.out.println("NOT arm");

		}
	}

}
