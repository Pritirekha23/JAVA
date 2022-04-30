package com.java.core;
interface Father{
	void print();
}
interface Mother{
	void show();
}
class Eample implements Father 
{
	public void print()
	{
		System.out.println("Hey");
	}
	 public void show() 
	 {
	System.out.println("Hello");
     }
	 public static void main(String[]args)
	 {
		 Eample ob=new Eample(); 
		 ob.print();
		 ob.show();
	 }
}

