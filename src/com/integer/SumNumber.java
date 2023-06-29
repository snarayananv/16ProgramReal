package com.integer;

public class SumNumber {
	 public static void main(String[] args) {
	       int num=2345;
	       int rem=0, sum=0, sum1=0;
	       while(num>0){
	           rem=num%10;
	           sum=sum+rem;
	           num=num/10;
	       }
	      System.out.println(sum);
	       while(sum>0){
	           int tem=sum%10;
	            sum1=sum1+tem;
	           sum/=10;
	       }
	       System.out.println(sum1);
	    }

}
