package ajp_codes;

import java.awt.*;
import java.awt.event.*;

class Myframe12 extends Frame
{
	Panel mainPanel;
	Label lbltitle;
	Label lbluser;
	Label lblpass;
	Button btnclick;
	TextField txtname;
	TextField txtname1;
	public Myframe12()
	{
		setSize(700,500);
		setTitle("My frame");
		setLayout(null);
		setLocationRelativeTo(null);
		setBackground(Color.black);
		addComponent();
		setVisible(true);

		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
		
	}
	private void addComponent()
	{
		mainPanel=new Panel();
		mainPanel.setLayout(null);
		mainPanel.setBackground(Color.white);
		mainPanel.setBounds(0,0,this.getWidth(),this.getHeight());
		
		
		lbltitle=new Label("Login Page");
		lbltitle.setBounds(20,50,660,70);
		lbltitle.setFont(new Font("verdena",Font.BOLD,50));
		lbltitle.setForeground(Color.yellow);
		lbltitle.setBackground(Color.black);
		lbltitle.setAlignment(Label.CENTER);
		mainPanel.add(lbltitle);

		
		lbluser=new Label("Username");
		lbluser.setBounds(50,150,200,70);
		lbluser.setFont(new Font("verdena",Font.BOLD,30));
		lbluser.setForeground(Color.yellow);
		lbluser.setBackground(Color.black);
		lbluser.setAlignment(Label.CENTER);
		mainPanel.add(lbluser);
		
		lblpass=new Label("Password");
		lblpass.setBounds(50,250,200,70);
		lblpass.setFont(new Font("verdena",Font.BOLD,30));
		lblpass.setForeground(Color.yellow);
		lblpass.setBackground(Color.black);
		lblpass.setAlignment(Label.CENTER);
		mainPanel.add(lblpass);


		txtname=new TextField();
		txtname.setBounds(350,150,200,70);
		txtname.setFont(new Font("verdena",Font.BOLD,20));
		txtname.setBackground(Color.white);
		txtname.setForeground(Color.black);
		
		
		mainPanel.add(txtname);
		
		txtname1=new TextField();
		txtname1.setBounds(350,250,200,70);
		txtname1.setFont(new Font("verdena",Font.BOLD,20));
		txtname1.setBackground(Color.white);
		txtname1.setForeground(Color.black);
		txtname1.setEchoChar('*');
		mainPanel.add(txtname1);

		btnclick=new Button("Login");
		btnclick.setBounds(250,370,150,70);
		btnclick.setFont(new Font("verdena",Font.BOLD,40));
		btnclick.setBackground(Color.black);
		btnclick.setForeground(Color.yellow);
		btnclick.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnclick);

		add(mainPanel);
	}
}
class code5
{
	public static void main(String args[])
	{
		Myframe12 obj=new Myframe12();
	}
}

