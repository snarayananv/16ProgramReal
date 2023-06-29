package com.project;

public class StringReverse {
	public static void main(String[] args) {
		String s = "welcome to java class";
		String[] sp = s.split(" ");
		String s2 = "";
		for (String x : sp) {
			String s3 = "";
			for (int i = x.length() - 1; i >= 0; i--) {
				char c = x.charAt(i);
				s3 = s3 + c;
			}
			s2 = s2 + s3 + " ";
		}
		System.out.println(s2);
	}
}
