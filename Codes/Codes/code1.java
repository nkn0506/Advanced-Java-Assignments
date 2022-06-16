package ajp_codes;


import java.awt.Frame;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.*;

public class code1 extends Frame implements ActionListener
   {
       
	private TextField t1;
    private TextField t2;
    Button b1;
	Button b2;
	
	
	public static void main(String[] args) 
	{
		System.out.println("Name: Neha Kamalakar Nemade\nRoll no: 32147");
		code1 Aobj= new code1 ();
	}
	
	public code1 ()
	{
		setTitle("Intro to TextField");
		setVisible(true);
		setSize(400,400);
		setLocation(100,100);
		setLayout(new FlowLayout(FlowLayout.CENTER,100,50));
		setBackground(Color.white);
		t1=new TextField(20);
		t2=new TextField(20);
		
		add(t1);
		add(t2);
		
		
		 b1=new Button("SWAP");
		 add(b1); 
		 b1.addActionListener(this);
		 b2=new Button("Exit");
		 add(b2); 
		 b2.addActionListener(this);
		 
		 addWindowListener(new WindowAdapter()
		 {
		       public void windowClosing(WindowEvent e)
		       {
		            dispose();
		       }
		 });
	}

	public void actionPerformed(ActionEvent e)
	{
		System.out.println("SWAP VALUES");
		String text1=t1.getText();
		String text2=t2.getText();
		//System.out.println(text1);
		//System.out.println(text2);
		t1.setText(text2);
		t2.setText(text1);
		Object exit=e.getSource();
		if(exit==b2)
		{
		 dispose();	
		}
		
	}
}

