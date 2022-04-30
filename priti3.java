//Thread creation by implemanting Runnable interface

class fun extends Thread{
public void run()
{
for(int p=0;p<5;p++)
{
System.out.println("hello i am the fun class "+p);
}
}
}
class dance extends Thread{
public void run()
{
for(int p=0;p<5;p++)
{
System.out.println("hello i am the dance class "+p);
}
}
}
class priti3{
public static void main(String[]args)
{
fun a1=new fun();
dance a2=new dance();
Thread b1=new Thread(a1);
Thread b2=new Thread(a2);
a1.start();
a2.start();
}
}