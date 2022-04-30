// WAP TO CREAT TWO DIFFERENT CLASS AND EXECUTE THE DIFFERENT TASK BY USING DIFFERENT THREADS
  
 
class Multi extends Thread{
public void run()
{
     System.out.println("Hello i'm priti");
}
}
class Multi1 extends Thread{
public void run()
{
     System.out.println("Hello i'm Smruti");
}
}
class Run
{
  public static void main(String[]args)
{
       Multi ob1=new Multi();
       Multi1 ob2=new Multi1();
     ob1.start();
     ob2.start();
 }
}
