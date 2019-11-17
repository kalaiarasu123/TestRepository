package week3.day2;

import java.util.Collections;
import java.util.LinkedList;

public class Reverseorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> object = new LinkedList<String>(); 
		object.add("CTS");
		object.add("HCL");
		object.add("Aspire Systems");
		object.add("Infosys");
		object.add("TCS");
		  System.out.println("Linked list : " + object); 
		Collections.reverse(object);
		
		  System.out.println("Modified list : " + object); 
	}

}
