package ajp_codes;

import java.io.*;
import java.util.*;

class code11 {
	public static void main(String args[])
	{
		
		HashMap<Integer, String> student_data = new HashMap<>();

		student_data.put(1, "Neha");
		student_data.put(2, "Riya");
		student_data.put(3, "Maya");
		student_data.put(4, "Priyanka");
		student_data.put(5, "Jeny");
		student_data.put(6, "John");

		System.out.println("|---Roll No.----Name------|");

		for (Map.Entry<Integer, String> e : student_data.entrySet())
            System.out.println("|      "+e.getKey()+ "        " + e.getValue());
	
		
		System.out.println("--------------------------");
		
	}
}

