package com.java.core;

import java.util.*;
 class Test {
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Test{
	void bark()
	{
		System.out.println("barking");
		
	}
}
class Single
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.eat();
		d.bark();
	}
}
