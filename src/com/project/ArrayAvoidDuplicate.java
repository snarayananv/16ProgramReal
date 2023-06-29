package com.project;

import java.util.*;

public class ArrayAvoidDuplicate {
	public static void main(String[] args) {
		int[] a = new int[7];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 2;
		a[5] = 3;
		a[6] = 5;
		Set<Integer> se = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			se.add(a[i]);
		}
		System.out.println(se);
//		for (Integer x : se) {
//			System.out.println(x);
//		}
	}
}
