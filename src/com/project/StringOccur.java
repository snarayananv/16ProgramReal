package com.project;

import java.util.*;

public class StringOccur {

	public static void main(String[] args) {
	       String s="welcome to java class to java sn";
	       String[] s1 = s.split(" ");
	       Map<String,Integer> mp = new LinkedHashMap<>();
	       for(int i=0;i<s1.length;i++){
	           String c= s1[i];
	           if(mp.containsKey(c)){
	               Integer x=mp.get(c);
	               mp.put(c,x+1);
	           } else  {
	               mp.put(c,1);
	           }
	       }
	     System.out.println(mp);
}
}