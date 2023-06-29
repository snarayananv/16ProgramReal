package com.project;

public class CharacterOccuereneWithoutMap {
	public static void main(String[] args) {
		String s = "suriyanarayanan dear";
		int[] a = new int[256];
		for (int i = 0; i < s.length(); i++) {
			//a[(int)s.charAt(i)]++;		
		    char c = s.charAt(i);	
		    int n=c-0;
		     a[n]++;
		
		}
     for (int i = 0; i < 256; i++) {
		if(a[i]!=0) {
			System.out.println((char)i+" "+a[i]);
		}
	}

	}

}
