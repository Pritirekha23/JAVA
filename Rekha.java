  
 //WAP TO EXECUTE MULTIPLE TASKS BY USING SINGLE THREADS 
      class Rekha extends Thread
       {
         public void run(){
      System.out.println("hello i'm Priti");
      }
       public static void main(String[]args){
       Rekha r1=new Rekha();
        r1.start();
         Rekha r2=new Rekha();
        r2.start();
        }
        }
