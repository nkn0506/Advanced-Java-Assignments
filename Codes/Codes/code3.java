package ajp_codes;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Frame creation by association method

class myframe
{
// initializing using constructor
myframe()
{
   // creating a Frame
   Frame f = new Frame();
   //creating a button
   Button b = new Button("Click Here!!");
   b.setBackground(Color.red);
   // adding button into frame
   f.add(b);
   // now frame will be visible, by default it is not visible
   f.setVisible(true);
   // frame size 600 width and 600 height
   f.setSize(600,600);
   // setting the location of Frame
   f.setLocation(100,50);
   // setting the title of Frame
   f.setTitle("MyFrame");
   f.setResizable(false);
//   f.setBackground(Color.CYAN);

   f.addWindowListener(new WindowAdapter(){
       public void windowClosing(WindowEvent e)
   {
        f.dispose();
   }
   });
}
}
public class code3 {
		
     public static void main(String[] args)
     {
         // TODO Auto-generated method stub
    	 System.out.println("Name: Neha Kamalakar Nemade\nRoll no: 32147");
         myframe obj=new myframe();
      }
}
