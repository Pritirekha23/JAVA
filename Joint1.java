class Joint1 extends Thread
{
public void run(){
for(int i=0;i<=3;i++)
{
try{

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
Joint1 t=new Joint1();
t.start();
t.join();

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