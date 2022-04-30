package com.java.core;

class mira 
{
	public static void main(String arr[])
	{
		int n=345,rev=0,lastdigit;
		while(n>0)
		{
			lastdigit=n%10;
			rev=rev*10+lastdigit;
			n=n/10;
		}		System.out.println("given no is 345");
		System.out.println("The reverse of 345 is" +rev);
		
		}
}


