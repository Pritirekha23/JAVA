package com.java.core;

 class Animal
 {
	 void eat() {
		 System.out.println("eating..");
	 }
 }
 class Dog extends Animal
 {
	 void bark() {
		 System.out.println("barking..");
	 }
 }
 class cat extends Animal{
	 void meow() {
		 System.out.println("meowing..");
	 }
 }
 class Hierarchical{
	 public static void main(String[]args) {
		 cat c=new cat();
		 c.meow();
		 c.eat();
		// c.bark();
	 }
 }

