package com.project;
public class Stringuperlow {
	public static void main(String[] args) {
		String s = "WelcomE Is SuriyaNarayanan223@c.com";
		String s1 = s.replace(" ", "");
		String u = "", l = "", sp = "", d = "";
		int u1 = 0, l1 = 0, sp1 = 0, d1 = 0;
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (Character.isUpperCase(c)) {
				u = u + c;
				u1++;
			} else if (Character.isLowerCase(c)) {
				l = l + c;
				l1++;
			} else if (Character.isDigit(c)) {
				d = d + c;
				d1++;
			} else {
				sp = sp + c;
				sp1++;
			}
		}
		System.out.println(u);
		System.out.println(u1);
		System.out.println(l);
		System.out.println(l1);
		System.out.println(d);
		System.out.println(d1);
		System.out.println(sp);
		System.out.println(sp1);
	}
}
