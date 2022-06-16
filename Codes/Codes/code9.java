package ajp_codes;

import java.awt.*;
import java.awt.event.*;

public class code9 extends Frame {

   public static void main(String[] args) {
	   System.out.println("Name: Neha Kamalakar Nemade\nRoll no: 32147");
      code9 obj= new code9();


      obj.addWindowListener(new WindowListener()
      {
         public void    windowActivated(WindowEvent e)
         {
            System.out.println("window is activated");
         }
         public void    windowClosed(WindowEvent e)
         {
            System.out.println("window is closed");
         }
         public void    windowClosing(WindowEvent e)
         {
            System.out.println("window is closing");
            obj.dispose();
         }
         public void windowDeactivated(WindowEvent e)
         {
            System.out.println("window is deactivated");
         }
         public void windowDeiconified(WindowEvent e)
         {
            System.out.println("window is deiconified");
         }
         public void    windowIconified(WindowEvent e)
         {
            System.out.println("window is iconified");
         }
         public void    windowOpened(WindowEvent e)
         {
            System.out.println("window is opened");
         }

      });


   }

   code9()
   {
      setSize(300,500);
      setLocation(200,300);
      setVisible(true);
   }

}