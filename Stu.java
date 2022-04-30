
 class Stu{
  int DOB ;
  int regd no;
String branch;
String name;
  Stu(int d,int r,String n,String b){
  DOB=d;
  regd no=r;
  branch=b;
  name=n;
 }
void disaplya()
{
System.out.println(DOB+" "+regd no+" "+branch+" "+name);
}
public static void main(String[]args)
{
Stu s1=new Stu(30.09.2002,102,CSE,Rajsh dash);
Stu s2=new Stu(30.10.2002,112,CE,Raja dash);
s1.display();
s2.display();
}
}