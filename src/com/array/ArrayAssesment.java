package com.array;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayAssesment {
	public static void main(String[] args) {
		int[] a = { 3,2,4};
		int[] b = { 1, 2, 5 };
		int n = 0;
		Set<Integer> s = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				s.add(a[i]);
				s.add(b[j]);
			}
		}
		for (int i = 0; i < s.size(); i++) {
			Integer[] ar = new Integer[i];
			Integer[] s1 = s.toArray(ar);
			if (s1[i] % 2 == 0) {
				System.out.println(s1[i]);
			}
		}
	}

}
//for (int i = 0; i < s.size(); i++) {
//	Integer[] ar = s.toArray(new Integer[s.size()]);
//	if (ar[i] % 2 == 0) {
//		System.out.println(ar[i]);
//	}

//int[] a= {3,2,4};;
//int[] b= {1,2,5};
//List<Integer> l=new ArrayList<>();
//Set<Integer> s1=new LinkedHashSet<>();
//for(int i=0;i<a.length;i++) {
//	for(int j=0;j<b.length;j++) {
//		l.add(a[i]);
//		l.add(b[j]);
//	}
//}
//for(int i=0;i<l.size();i++) {
//	Integer x=l.get(i);
//	if(x%2==0) {
//		s1.add(x);
//	}
//}
//System.out.println(s1);



