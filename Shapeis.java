package com.java.core; 
class Shape
{
void draw()
    {
	System.out.println("drawing");
    }
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangular drawing");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Triangular drwaing");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circular drawing");
	}
}
class Shapeis
{
	public static void main(String []args)
	{
		Shape s;
		s=new Rectangle();
		s.draw();
		s=new Triangle();
		s.draw();
		s=new Circle();
		s.draw();
	}
}