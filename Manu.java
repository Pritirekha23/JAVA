

 class Manu
{
    int id,age;
     String name;
Manu(int i,String n,int a){
       id=i;name=n; age=a;
 }
Manu(int i,String n)
{
   id=i;name=n;
}

    void display(){
   System.out.println(id+" "+name+" "+age);
     }

public static void main(String[]args) {
Manu m1=new Manu(157,"Smruti",02);
      Manu m2=new Manu(156,"priti");
      
   m1.display();
  m2.display();
}
}
