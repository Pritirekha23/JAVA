  interface printable{
    void print();
  }
 interface Showable extends printable{
   void show();
 }
 class You implements  printable,Showable{
       public void print()
   {
    System.out.println("Yes yes");
 }
 public void show()
{
 System.out.println("HII hlo");
} 
 public static void main(String []args)
{
  You b=new You();
   b.print();
  b.show();
}
}