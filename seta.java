//WAP  TO CREATE A SET INTERFACE WITH DIFFERENT VALUES AND DISPLAY

class seta{
   public static void main(String[]args){
        Set<Integer> n=new HashSet<>();
 n.add(545);
 n.add(5);
 n.add(2);  
 n.add(1); 
 n.add(3); 
 n.add(45); 
 n.add(54);
n.add(null);
System.out.println(n);
System.out.println("getti9ng the element");
Iterator itr=n.iterator();
while(itr.hasNext())
{
   System.out.println(itr.next());
      }
   }
}
       