package com.java.core;

class Armstrong {
	public static void main(String[]args) {
		int n=153,arm=0,r,c;
		c=n;
		while(n>0)
		{
			r=n%10;
			arm=(r*r*r)+arm;
			n=n/10;
		}
		if(c==arm) {
			System.out.println("armstrong no.");
		}
		else {
			System.out.println("not armstrong no");
		}
	}

}
