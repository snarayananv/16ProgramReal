package com.string;

public class StringEvenReverse {
	public static void main(String[] args) {
		String s = "welcome to java class";
		String[] sp = s.split(" ");
		String s2 = "";
		String s1 = "";
		for (int i = 0; i < sp.length; i++) {
			String c = sp[i];
			if (i % 2 != 0) {
				for (int j = c.length() - 1; j >= 0; j--) {
					char c1 = c.charAt(j);
					s2 = s2 + c1;
				}
				s1 = s1 + s2 + " ";
			} else {
				s2 = s1 + c + " ";
			}
		}
		System.out.println(s2);
	}

}
