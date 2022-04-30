class funny extends Thread{
       public void run()
          {
            for(int p=0;p<5;p++)
                              {
       System.out.println("hello i am the fun class "+p);
                      }
                   }
             
        public static void main(String[]args){
           funny a1=new funny();
         Thread b1=new Thread(a1);
     a1.start();
            }
   }