class student5
{
int regd;
String name;
student5( int r,String n){
regd=r;
name=n;
}
void display()
{
System.out.println(regd+" "+name);
}
public static void main(String[]args)
{
student5 s5=new student5(111;'2001297033');
student5 s6=new student5(222,"priti");
s5.display();
s6.display();
}
}