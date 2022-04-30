
//finally example where  exception not occur 

//package com.java.core;
//
//public class Excep08 {
//        public static void main(String[]args)
//        {
//        	try {
//        		int data=25/5;
//        		System.out.println(data);
//        	}
//        	catch(NullPointerException e)
//        	
//        	{
//        		System.out.println(e);
//        	}
//        	finally {
//        		System.out.println("finallly block is always executed");
//        	}
//    		System.out.println("rest of the code");
//        }
//        
//}




////finally example where  exception occur but not handled
//package com.java.core;
//
//public class Excep08 {
//        public static void main(String[]args)
//        {
//        	try {
//        		int data=25/0;
//        		System.out.println(data);
//        	}
//        	catch(NullPointerException e)
//        	
//        	{
//        		System.out.println(e);
//        	}
//        	finally {
//        		System.out.println("finallly block is always executed");
//        	}
//    		System.out.println("rest of the code");
//        }
//        
//}


////finally example where  exception occur and handled


package com.java.core;

public class Excep08 {
        public static void main(String[]args)
        {
        	try {
        		int data=25/0;
        		System.out.println(data);
        	}
        	catch(ArithmeticException e)
        	
        	{
        		System.out.println(e);
        	}
        	finally {
        		System.out.println("finallly block is always executed");
        	}
    		System.out.println("rest of the code");
        }
        
}

