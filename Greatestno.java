package com.java.core;

import java.util.Scanner;

class  Greatestno
{
	public static void main(String[]args)
	{
		Scanner Sc=new Scanner(System.in);

		System.out.println("enter 1st no\n");
		int a=Sc.nextInt();
		System.out.println("enter 2nd no\n");
		int b=Sc.nextInt();
		System.out.println("enter 3rd no\n");
		int c=Sc.nextInt();
	            	if(a>b && a>c)
		            {
		        	System.out.println("a");
		            }
	                  	else if(b>a && b>c)
	                  		{
	                  			System.out.println("b");
	                  		}
		
		                 	else
		             	{
		          		System.out.println("c");
		             	}
	}
}
		
