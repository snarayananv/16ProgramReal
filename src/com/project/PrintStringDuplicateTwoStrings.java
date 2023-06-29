package com.project;

public class PrintStringDuplicateTwoStrings {
	public static void main(String[] args) {
		String s = "suriya";
		String s1 = "narayanan";
		for (int i = 0; i < s.length(); i++) {
			int co = 0;
			char c = s.charAt(i);
			for (int j = 0; j < s1.length(); j++) {
				char c1 = s1.charAt(j);
				if (c == c1) {
					co++;
				}
			}
			if (co != 0) {
				System.out.println(c + "-->" + co);
			}
		}

	}
}
