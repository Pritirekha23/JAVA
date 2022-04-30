//package com.java.core;
//
//public class Excep07 {
//
//	        public static void main(String[]args)
//	        {
//	        	try {
//	        		int arr[]=new int[5];
//                   System.out.println(arr[8]);
//	        	}
//	        	catch(ArithmeticException e)
//	        	{
//	        		System.out.println(e);
//	        	}
//	        	catch(ArrayIndexOutOfBoundsException e)
//	        	{
//	        		System.out.println(e);
//	        	}
//	        	catch(Exception e)
//	        	{
//	        		System.out.println(e);
//	        	}
//	        	System.out.println("Lines of codes");
//
//	        }
//	}
//
//
 

 // IN THIS EXAMPLE ,TRY BLOCK CONTAINS TEWO EXCEPTIONS BUT AT A TIME ONLY ONE EXCEP[TION OCCURS AND ITS CORRESPONDING CATCH BLOCK IS INVOKED
//
//package com.java.core;
//
//public class Excep07 {
//
//	        public static void main(String[]args)
//	        {
//	        	try {
//	        		int arr[]=new int[5];
//	        		  arr[5]=30/0;
//                   System.out.println(arr[8]);
//	        	}
//	        	catch(ArithmeticException e)
//	        	{
//	        		System.out.println(e);
//	        	}
//	        	catch(ArrayIndexOutOfBoundsException e)
//	        	{
//	        		System.out.println(e);
//	        	}
//	        	catch(Exception e)
//	        	{
//	        		System.out.println(e);
//	        	}
//	        	System.out.println("Lines of codes");
//
//	        }
//	}


//HERE WE GENERATE NULLPOUNTER EXCEPTION ,BUT DID'NT PROVIDE THE CORRESPONDING EXCEPTION TYPE. HEEE PARENT CLASS EXCEPTION WILL INVOKED

//package com.java.core;
//
//public class Excep07 {
//
//	        public static void main(String[]args)
//	        {
//	        	try {
//	        		String s=null;
//                   System.out.println(s.length());
//	        	}
//	        	catch(ArithmeticException e)
//	        	{
//	        		System.out.println(e);
//	        	}
//	        	catch(ArrayIndexOutOfBoundsException e)
//	        	{
//	        		System.out.println(e);
//	        	}
//	        	catch(Exception e)
//	        	{
//	        		System.out.println(e);
//	        	}
//	        	System.out.println("Lines of codes");
//
//	        }
//	}

//can we  handle the exception without maintaining the order of exception (i.e most Specific to most general)
  
// ans is no ,u should maintain the order (i.e most Specific to most general)  nhi to u will get compile time error 

//package com.java.core;
//
//public class Excep07 {
//
//	        public static void main(String[]args)
//	        {
//	        	try {
//	        		int arr[]=new int[5];
//                     arr[5]=50/0;
//	        	}
//	        	catch(Exception e)
//	        	{
//	        		System.out.println(e);
//	        	}
//	        	catch(ArithmeticException e)
//	        	{
//	        		System.out.println(e);
//	        	}
//	        	catch(ArrayIndexOutOfBoundsException e)
//	        	{
//	        		System.out.println(e);
//	        	}
//
//	        	System.out.println("Lines of codes");
//
//	        }
//	}











