//WRITE A PROGRAM TO EXCEPTION USING NULLPOINTER

   class preeti
     {
        public static void main(String args[])
           {
               String d= null;
               try
                  {
                    System.out.println(d.length());
                    }
                catch(NullPointerException e)
                    { 
                    System.out.println(e);
                   }
             
                    System.out.println("Rest of the code is here ........");
           }
    }