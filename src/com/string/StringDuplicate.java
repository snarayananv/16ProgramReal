package com.string;

import java.util.*;
import java.util.Map.Entry;

public class StringDuplicate {
	public static void main(String[] args) {
		 String s="Welcome to java class";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter String = ");
//		String s = sc.nextLine();

		String s1 = s.replace(" ", "");
		String dup = "";
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (mp.containsKey(c)) {
			} else {
				mp.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> se = mp.entrySet();
		for (Entry<Character, Integer> x : se) {
			dup = dup + x.getKey();
		}
		System.out.println(dup);
	}
}
