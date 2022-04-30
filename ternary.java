class ternary
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int grtnum=(a>b)?(a>c?a:c):(b>c?b:c);
System.out.println("The greatest number is"+grtnum);
}
}