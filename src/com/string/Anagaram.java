package com.string;

import java.util.*;

public class Anagaram {
	public static void main(String[] args) {
		String s = "earTh";
		String s1 = "Heart";

		s = s.toLowerCase();
		s1 = s1.toLowerCase();
		Set<String> l = new TreeSet<>();
		Set<String> m = new TreeSet<>();
		for (int i = 0; i < s.length(); i++) {
			String s2 = " ";
			char c = s.charAt(i);
			s2 = s2 + c;
			l.add(s2);
		}
		System.out.println(l);
		for (int j = 0; j < s1.length(); j++) {
			String s3 = " ";
			char c1 = s1.charAt(j);
			s3 = s3 + c1;
			m.add(s3);
		}
		System.out.println(m);
		if (l.equals(m)) {
			System.out.println("Anagaram");
		} else {
			System.out.println("Not Anagaram");
		}

	}
}
