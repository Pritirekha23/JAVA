//java JButton example
 
 import java.awt.event.*;
 import javax.swing.*;
public class ButtonExample{
  publlic static void main(String []args){
   JFrame f= new JFrame("Button");
    final JTextField tf=new JTextField();
     tf.setBounds(50,50,150,20);
   JButton b=new JButton("click");
   b.setBounds(50,100,95,30);
   b.addActionListener(new ActionListener()
   {
      public void actionPerformed(ActionEvent e)
{
 tf.setText("Priti");
}
}):
  f.add(b);
f.add(tf);
 f.setSize(400,400);
 f.setlayout(null);
f.setVisible(true);
}
}

 