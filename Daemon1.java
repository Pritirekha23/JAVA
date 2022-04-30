//Daemon thread
public class Daemon1 extends Thread{
public void run()
{
if(Thread.currentThread().isDaemon())
{
System.out.println("daemon thread work");
}
else{
System.out.println("user thread work");
}
}
public static void main(String[]args)
{
Daemon1 r3=new Daemon1();
Daemon1 r1=new Daemon1();
Daemon1 r2=new Daemon1();

r1.setDaemon(true);

r3.start();
r1.start();
r2.start();
}
}