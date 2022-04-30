import java.awt.*;
public class myframe3{
public myframe3()
{
Frame f=new Frame();
Button btn=new Button("Hello world");
btn.setBounds(80,80,100,50);
f.add(btn);
f.setSize(300,250);
f.setTitle("JavaTpoint");
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[]){
 myframe3 awt=new myframe3();
}
}