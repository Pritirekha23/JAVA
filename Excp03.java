package com.java.core;

public class Excp03 {
          public static void main(String[]args)
          {
        	    try {
        	    	int data=100/0;
        	    }
        	    catch(Exception e)
        	    {
        	    	System.out.println(e);
        	    }
        	    System.out.println("can't divided by zero"); // displaying the  custom msg
          }
}
