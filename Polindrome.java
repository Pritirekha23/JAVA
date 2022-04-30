package com.java.core;

public class Polindrome 
{
	public static void main(String[]args) {
		int n=545,r,s=0,d;
		d=n;//d=545
		while(n>0) //545>0(T)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(d==s) {
			System.out.println("polindrome no");
		}
		else {
		System.out.println("not polindrome no");
	}

	}
}
