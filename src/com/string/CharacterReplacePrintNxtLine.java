package com.string;

public class CharacterReplacePrintNxtLine {
	public static void main(String[] args) {

		String s = "welcome to java class";
		String s1 = s.replace(" ", "");
		String s2 = "", r = "";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			s2 = s2 + c;
			r = s2.replace("l", "\n");

		}
		System.out.println(r);
	}

}
