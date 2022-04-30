//write a program to execute a looping program that display 1 to 5 by using a single thread

class Pri extends Thread{
public static void main(String[]args)
{
for(int i=1;i<=5;i++)
{
System.out.println(i);
}
}
}