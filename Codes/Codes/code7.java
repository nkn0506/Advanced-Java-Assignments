package ajp_codes;

import java.awt.*;
public class code7 extends Frame{

	 
		public static void main(String[] args) 
		{
		    System.out.print("\nName: Neha Kamalakar nemade\nRoll no: 32147");
			code7 Aobj= new code7();

		}
		public code7()
		{
			setTitle("Study of GridLayout class");
			setVisible(true);
			setSize(400,500);
			setLocation(100,100);
			
			//setLayout(new GridLayout());
			
			//setLayout(new GridLayout(2,3));  //  row 2 and coloum 3
			//setLayout(new GridLayout(3,2));  //  row 3 and coloum 2
			
			setLayout(new GridLayout(2,3,10,15));  //  row 2, coloum 3, Hgap 10, Vgap 15
			add(new Button("1"));
			add(new Button("2"));
			add(new Button("3"));
			add(new Button("4"));
			add(new Button("5"));
			add(new Button("6"));
	}

}
