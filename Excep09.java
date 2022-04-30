//nested try block


package com.java.core;

public class Excep09
         {
	
	      public static void main(String[]args)
	      {
               try 
                 {
                   System.out.println("Normal1 flow");
// 	    	      int a[]=new int[5];
//	    	         a[6]=4;
            	    try
            	    {
            		    System.out.println("Going to devide");
            		    int b=30/0;
            	        }
            	       catch(ArithmeticException e)
            	         {
            		     System.out.println(e);
            	         }
            	    
            	            try
            	            {
            	    	      int a[]=new int[5];
            	    	         a[5]=4;
            	                }
                              catch(ArrayIndexOutOfBoundsException e)
            	                   {
                                      System.out.println(e);
            	                   }  
            	            System.out.println("Other statement");
                    }
            	  catch(Exception e) {
            	    System.out.println("exception handeled");
            	    }
                    System.out.println("Normal flow");	   
                 }
             }
