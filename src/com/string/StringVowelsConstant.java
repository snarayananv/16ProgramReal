package com.string;

public class StringVowelsConstant {

	public static void main(String[] args) {
		     String s="welcome suriya narayanan";
		     String sp=s.replace(" ", "");
		     String ch="",v="";
		     int c1=0,v1=0;
		     for(int i=0;i<sp.length();i++){
		         char c = sp.charAt(i);
		         if(c=='A'||c=='a'||c=='e'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'){
		             ch=ch+c;
		             c1++;
		         } else {
		            v=v+c;
		            v1++;
		         }
		     }
		     System.out.println(ch);
		System.out.println(c1);
		System.out.println(v);
		System.out.println(v1);
}
}