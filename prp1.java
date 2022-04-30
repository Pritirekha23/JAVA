
 class print extends Thread{
         public void run(){
                for(int p=1;p<=5;p++){
                       System.out.println(p);
                                     }
                           }
           }
  class  prp1{
       public static void main(String[]args){
                 print p1=new print();
         
                 p1.start();
                 }
             }
