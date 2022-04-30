package com.java.core;

public class Excep06 {
        public static void main(String[]args)
        {
        	try {
        		int arr[]=new int[5];   //here the length is 5 that is 0,1,2,3,4 but we want to access 5 index which is not exists here
        		arr[5]=20/2;
        	}
        	catch(ArithmeticException e)
        	{
        		System.out.println(e);
        	}
        	catch(ArrayIndexOutOfBoundsException e)
        	{
        		System.out.println(e);
        	}
        	catch(Exception e)
        	{
        		System.out.println(e);
        	}
        	System.out.println("Lines of codes");

        }
}
