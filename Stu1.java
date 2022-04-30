
 class Stu1{
  int DOB ;
  int regdno;
String branch;
String name;
  Stu1(int d,int r,String n,String b){
  DOB=d;
  regdno=r;
  branch=b;
  name=n;
 }
void disaplya()
{
System.out.println(DOB+" "+regdno+" "+branch+" "+name);
}
public static void main(String[]args)
{
Stu1 s1=new Stu1(30,102,"CSE","Rajesh dash");
Stu1 s2=new Stu1(31,112,"CE","Raja dash");
s1.display();
s2.display();
}
}