package com.array;

public class NumericAlphaNumeric {
	public static void main(String[] args) {
		String s = "hai23 33 hello98 43";
		String[] s1 = s.split(" ");
		String s2="",s3="";
		for (int i = 0; i < s1.length; i++) {
             String c=s1[i];			
			s2=s2+c+" ";
			
		}
		System.out.println(s2);
		for(int i=0;i<s2.length();i++) {
			char c=s2.charAt(i);
			if(Character.isLetter(c)) {
				
			} else {
				s3=s3+c;
			}
		}
		System.out.println(s3);
	}
}
