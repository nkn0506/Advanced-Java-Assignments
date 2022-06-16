package ajp_codes;
import java.awt.*;
public class code6 extends Frame{
      
	    private Panel north;
	    private Panel east;
	    private Panel west;
	    private Panel south;
	    private Panel center;
	    
		public static void main(String[] args) 
		{
			System.out.println("Name: Neha Kamalakar Nemade\nRoll no: 32147");
		
			code6 Aobj= new code6();

		}
		public code6()
		{
			setTitle("Study of Border Layout class");
			setVisible(true);
			setSize(400,500);
			setLocation(100,100);
			setLayout(new BorderLayout());
			
			
			north= new Panel();
			east= new Panel();
			west= new Panel();
			south= new Panel();
			center= new Panel();
			
	        north.setPreferredSize(new Dimension(200,120));
			east.setPreferredSize(new Dimension(150,500));
			west.setPreferredSize(new Dimension(100,500));
			south.setPreferredSize(new Dimension(200,100));
			
			
			north.setBackground(Color.cyan);
			east.setBackground(Color.GREEN);
			west.setBackground(Color.black);
			south.setBackground(Color.YELLOW);
			center.setBackground(Color.PINK);
			
			add(north, BorderLayout.NORTH);   // container class add method with component and constraints from border layout class
			add(east, BorderLayout.EAST);
			add(west, BorderLayout.WEST); 
			add(south, BorderLayout.SOUTH);
			add(center, BorderLayout.CENTER);
			
			//center.add(new Button("Okay"), BorderLayout.CENTER);
			//east.add(new TextField(10), BorderLayout.EAST);
	    }
}
