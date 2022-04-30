package com.java.core;

public class Gcd {
	public static void main(String[]args) {
		int x=10,y=35,gcd=1,i;
		for(i=1;i<=x && i<=y;i++) {
			if(x%i==0 && y%i==0) 
				gcd=i;
		}
		System.out.println();
	}

}
