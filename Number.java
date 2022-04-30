package com.java.core;

public class Number 
{
	public static void main(String[]args) {
		int n=356,i,count=0;
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2){
			System.out.print("prime no");
		}
		else {
		System.out.println("not prime no");
	}

}
}
