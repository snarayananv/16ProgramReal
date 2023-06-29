package com.string;

public class StringConvertUppertoLow {

	public static void main(String[] args) {
		String s = "welcome to java";
		StringBuffer bf = new StringBuffer(s);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i%2==0) {
				bf.setCharAt(i, Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
				bf.setCharAt(i, Character.toUpperCase(c));
			}
		}
		System.out.println(bf);

	}
}
