package com.string;

public class StringDuplicateRemoveWithuoutUseSet {
public static void main(String[] args) {
		
		String s="welcome to to java class 2class";
		String[] s1=s.split(" ");
		String r="";
		for(int i=0;i<s1.length;i++) {
			boolean n=false;
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].equals(s1[j])) {
					n=true;
					break;
				}
			}
			
			if(!n) {
				r=r+s1[i]+" ";
			}
		}
		System.out.println(s);
		System.out.println(r);
}
}
