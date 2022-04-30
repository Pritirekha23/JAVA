class Studentm{
   int id;
   String name;
     int age;
Studentm(int i,String n)
{
id=i;
name=n;
}
Studentm(int i,String n,int a)
{
id=i;
name=n;
age=a;
}
void display()
{
System.out.println(id+" "+name+" "+age);
}
public static void main(String[]args){
Studentm m1=new Studentm(198,"mona");
Studentm m2=new Studentm(156,"priti",19);
m1.display();
m2.display();
}
}