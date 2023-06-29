package com.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayRemoveDupliPrintParticulerNo {
	public static void main(String[] args) {

		int a[] = { 2, 1, 3, 2, 5, 0, 1, 3, 0, 7 };
		Set<Integer> s = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);

		}
		System.out.println(s);
		List l = new ArrayList<>();
		l.addAll(s);
		Object o = l.get(2);
		System.out.println("3rd Number is= " + o);
	}

}
