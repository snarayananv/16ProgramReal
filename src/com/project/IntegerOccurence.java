package com.project;

import java.util.Map;
import java.util.TreeMap;

public class IntegerOccurence {

	public static void main(String[] args) {
		int[] ar = { 1, 1, 2, 2, 3, 1, 6, 4 };

		Map<Integer, Integer> mp = new TreeMap<>();
		for (int i = 0; i < ar.length; i++) {
			Integer a = ar[i];
			if (mp.containsKey(a)) {
				Integer n = mp.get(a);
				mp.put(a, n + 1);
			} else {
				mp.put(a, 1);
			}

		}
		System.out.println(mp);
	}
}
