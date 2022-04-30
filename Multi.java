package com.java.core;

import java.util.*;
 class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("barking");
		
	}
}
class Babydog extends Dog
{
	void weep()
	{
		System.out.println("Weeping");
	}
}

class Multi
{
	public static void main(String args[])
	{
		Babydog d=new Babydog();
		d.eat();
		d.bark();
		d.weep();
	}
}



c