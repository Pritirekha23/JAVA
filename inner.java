 class out{
int data=30;
}
 class inner{
  void msg(){
 System.out.println("name is "+data);
   }
 public static void main(String[]args){
out t1=new out();
out.inner i=i.newinner();
i.msg();
}
}
