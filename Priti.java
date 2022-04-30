class A{
void eat()
{
System.out.println("hii i'm the  A class");
}
}
class B extends  A
{
void draw()
{
System.out.println("Hello i'm the child of A class and my name is B");
}
}
class Priti
{
public static void main(String[]args){
B obj=new B();
obj.eat();
obj.draw();
}
}