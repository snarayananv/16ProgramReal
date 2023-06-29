package com.project;

public class StringUpTOLowCovertWithouutUsingBuffer {

	public static void main(String[] args) {
		String s = "suriya";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			String s2 = "";
			char c = s.charAt(i);
			if (i == 5 || i == 3) {
				char u = Character.toUpperCase(c);
				s2 = s1 + u;
			} else {
				s2 = s2 + c;
			}

			System.out.print(s2);
		}
	}

}
