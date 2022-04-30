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
class C extends  B
{
void print()
{
System.out.println("Hello i'm the child of A class and my name is C");
}
}
class Priti1
{
public static void main(String[]args){
C obj=new C();
obj.eat();
obj.draw();
obj.print();
}
}