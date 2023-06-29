package com.project;

import java.util.*;

public class CharacterOccurnce {
	public static void main(String[] args) {
		String s = "welcome to java class";
		String s1 = s.replace(" ", "");
		Map<Character, Integer> mp = new LinkedHashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (mp.containsKey(c)) {
				Integer x = mp.get(c);
				mp.put(c, x + 1);
			} else {
				mp.put(c, 1);
			}
		}
		System.out.println(mp);

	}

}
