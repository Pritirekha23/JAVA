

class Constructor {
           int area,length;
        
        Constructor(int i,int w)
                {
                          area=i*w;
                     }

            Constructor(float l,float w1)
                 {
                  area=l*w1;
                }
              void display() 
            {
          System.out.println("Area is "+area);
              }
            public static void main(String[]args)
       { 
              Constructor c1=new Constructor(6,7);
              Constructor c2=new Constructor(6.3,2.7);

              c1.display();
               c2.display();
            }
}