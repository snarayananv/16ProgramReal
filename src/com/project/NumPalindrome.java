package com.project;


public class NumPalindrome {
	public static void main(String[] args) {
		 int num=121;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter= ");
//		int num = sc.nextInt();
		int rev = 0, rem = 0, tem = num;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println(rev);
		if (tem == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("NOT");
		}
	}
}
