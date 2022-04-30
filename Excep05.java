package com.java.core;

public class Excep05 {
       public static void main(String[]args)
       {
    	   try {
    		   int arr[]= {1,4,6,8};
    		   System.out.println(arr[10]);
    	   }
    	        catch(Exception e)
    	   {
                 System.out.println(e);
    	   }
       	System.out.println("lines of codes is here");
       }
}
