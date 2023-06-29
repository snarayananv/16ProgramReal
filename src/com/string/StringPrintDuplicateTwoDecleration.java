package com.string;

public class StringPrintDuplicateTwoDecleration {
	public static void main(String[] args) {
		String s = "suriya";
		String s1 = "narayanan";
		
		char[] c = s.toCharArray();
		char[] c1 = s1.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int co = 1;
			for (int j = 0; j < c1.length; j++) {
				if (c[i] == c1[j] && c[i] != 0) {
					co++;
					c1[j] = 0;
				}
			}
			if (co > 1 && c[i] != 0) {
				System.out.println(c[i] + "-->" + co);
			}
		}

	}

}
