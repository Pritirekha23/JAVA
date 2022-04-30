//Wap to creat a thread to execute a task that is print '@' 10 times

 class print extends Thread{
         public void run(){
                for(int p=0;p<5;p++){
                       System.out.println("@");
                                     }
                           }
           }
  class  prp{
       public static void main(String[]args){
                 print p1=new print();
                 print p2=new print();
                 p1.start();
                 p2.start();
                 }
             }