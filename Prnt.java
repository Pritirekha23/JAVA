package com.java.core;

class parent
{
void print()
{
	
	System.out.println("parent class");
}		
}
class child1 extends parent
{
	void print()
	{
		System.out.println("child1 rama");
	}
}
class child2 extends parent
{
	void print()
	{
		System.out.println("child2 hari");
	}
}
	class Prnt
	{
		public static void main(String[]args)
		{
		parent p;
		p=new child1();
		p.print();
		p=new child2();
		p.print();
	}
}
