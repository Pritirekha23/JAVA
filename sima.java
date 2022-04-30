package com.java.core;

import java.util.Scanner;

public class sima {
	public static void main(String arr[])
	{
		int i,s;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of i=");
		i=obj.nextInt();
		s=1;
		for(i=1;i<=10;i++)
		{
			s=s*i;
		}
		System.out.println("the factorialnof i="+s);
		}
		
	}


