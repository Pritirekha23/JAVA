package com.java.core;
interface eat{
	void print();
}
interface bark extends eat{
	void show();
}
class INTR implements bark 
{
  public static void main(String[]args)
  {
	System.out.println("HII this is a Dog");  
  }
}

