package com.java.core;

public class Excep04 {
      public static void main(String[]args)
      {
    	  int i=40;
    	  int j=0;
    	  int k;
    	        try {
    		       k=i/j;   //may through exception
    	            }
    	            catch(Exception e)
    	        {
    	            	System.out.println(i/(j+2));  //resolving the Exception in  catch block
    	        }
      }
}
