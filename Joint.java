
class Joint extends Thread
{
static Thread mainthread;
public void run(){
for(int i=0;i<=3;i++)
{
try{
mainthread.join();
sleep(2000,200);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(i);
System.out.println(Thread.currentThread().getName());
}
}
public static void main(String args[])throws Exception
{
Joint t=new Joint();
t.start();
mainthread=Thread.currentThread();
for(int i=0;i<=3;i++)
{
try
{
sleep(2000,200);
}
catch(Exception e)
{
System.out.println(e);
}

System.out.println(i);
System.out.println(Thread.currentThread().getName());

}

}
}