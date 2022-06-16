package ajp_codes;
import java.awt.*;  
import java.awt.event.*;  
public class code8 extends Frame implements MouseListener
{  
	      Label l;  
          code8()
          {  
        	  addMouseListener(this);  
          
        	  l=new Label();  
        	  l.setBounds(20,50,100,20);  
        	  add(l);  
        	  setSize(300,300);  
        	  setLayout(null);  
        	  setVisible(true);  
          }  
          public void mouseClicked(MouseEvent e) {  
        	  System.out.println("Mouse Clicked");
        	  l.setText("Mouse Clicked");  
          }  
          public void mouseEntered(MouseEvent e) {  
        	  l.setText("Mouse Entered");  
        	  System.out.println("Mouse Entered");
          }  
          public void mouseExited(MouseEvent e) {  
        	  l.setText("Mouse Exited");  
        	  System.out.println("Mouse Exited");
          }  
          public void mousePressed(MouseEvent e) {  
        	  l.setText("Mouse Pressed");  
        	  System.out.println("Mouse Pressed");
          }  
          public void mouseReleased(MouseEvent e) {  
        	  l.setText("Mouse Released"); 
        	  System.out.println("Mouse Released");
          }  
          public static void main(String[] args) {  
        	  System.out.println("Name: Neha Nemade\nRoll no: 32147");
        	  new code8();  
          }  
}  
