package com.string;

public class VowelsReplace {
	public static void main(String[] args) {
		String s = "suriya";
		String s1 = "", s2 = "", re = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				s1 = s1 + c;
				String r = s1.replace(s1, "@");
				s2 = s2 + r;
			} else {
				s2 = s2 + c;
			}
		}
		System.out.println(s2);
	}
}
