package com.string;

public class StringDupicatePrint {
	public static void main(String[] args) {
		String s = "suriyanarayanan";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int co = 1;
			for (int j = i+1; j < c.length; j++) {
				if (c[i] == c[j] && c[i] != 0) {
					co++;
					c[j] = 0;
				}
			}
			if (co > 1 && c[i] != 0) {
				System.out.println(c[i] + "-->" + co);
			}
		}
	}
}
