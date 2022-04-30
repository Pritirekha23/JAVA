//SYnchronized method
class Table{
synchronized void print(int n) {
for(int i=1;i<=5;i++)
{
System.out.println(n*i);
try{
Thread.sleep(200);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
class Thread1 extends Thread{
Table r;
Thread1(Table r)
{
this.r=r;
}
public void run()
{
r.print(4);
}
}
class Thread2 extends Thread{
Table r;
Thread2(Table r)
{
this.r=r;
}
public void run()
{
r.print(400);
}
}
class Synchronizationmethod{
public static void main(String[]args)
{
Table ob=new Table();
Thread1 r1=new Thread1(ob);
Thread2 r2=new Thread2(ob);
r1.start();
r2.start();
}
}
