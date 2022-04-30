//Thread creation by extending the Thread class 

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
class priti2{
public static void main(String[]args)
{
fun a1=new fun();
dance a2=new dance();
a1.start();
a2.start();
}
}