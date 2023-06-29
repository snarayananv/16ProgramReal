package com.project;

public class ReversestringPositionNotChange {
	public static void main(String[] args) {

		String s = "welcome to java";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev + c;
		}
		String[] r = rev.split(" ");
		String re = "";
		for (int j = r.length - 1; j >= 0; j--) {
			String s2 = r[j];
			re = re + s2 + " ";
		}
		System.out.println(re);
	}

}
