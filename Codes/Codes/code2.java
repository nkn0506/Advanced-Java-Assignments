package ajp_codes;

import java.awt.Frame;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.*;

public class code2 extends Frame implements ActionListener{
	
	private TextField num1,num2,ans;
    private Button sum,sub,div,mul,reset;
    private Label l1,l2,l3;
	public static void main(String[] args) {
		System.out.println("Name: Neha Nemade\nRoll no: 32147\n");
		code2 obj= new code2();

	}

	public code2() {
		setTitle("ARITHMATIC CALCULATOR");
		setVisible(true);
		setSize(400,450);
		setLocation(100,100);
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		setBackground(Color.black);
		
		initialize();		
		addcomponents();
		addActionListeners();
	}
	
	public void  initialize()
	{
		l1=new Label("Input1");
		l1.setForeground(Color.white);
		num1=new TextField(20);
		l2=new Label("Input2");
		l2.setForeground(Color.white);
		num2=new TextField(20);
		l3=new Label("Output");
		l3.setForeground(Color.white);
		ans=new TextField(20);
		sum=new Button("SUM");
		sub=new Button("SUB");
		div=new Button("DIV");
		mul=new Button("MUL");
		reset=new Button("RESET");
		
	}
	
	public void addcomponents()
		{
		 add(l1);
		 add(num1);
		 add(l2);
		 add(num2);
		 add(l3);
		 add(ans);
		 add(sum);
		 add(sub);
		 add(div);
		 add(mul);
		 add(reset);
		 
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		String t1=num1.getText();
		String t2=num2.getText();
		
		Integer n1= Integer.parseInt(t1);
		Integer n2= Integer.parseInt(t2);
		Integer answer=0;
		
		Object b= e.getSource();
       
		 if(b==sum)
		 {
			 answer=n1+n2;
		 }
		 if(b==sub)
		 {
			 answer=n1-n2;
		 }
		 if(b==div)
		 {
			 answer=n1/n2;
		 }
		 if(b==mul)
		 {
			 answer=n1*n2;
		 }
		 if(b==reset)
		 {
			 num1.setText(" ");
			 num2.setText(" ");
		 }
		
		ans.setText(answer.toString());
	}
	
	public void addActionListeners()
	{
		sum.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
		reset.addActionListener(this);
		
		

	}
	
}
