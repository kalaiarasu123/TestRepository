package week1.day2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LearnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {
			int x =0;
			int y =5;
			int z=y/x;
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		catch(ArithmeticException ae){
			System.out.println("ArithmeticException");
		}*/
		PrintWriter out = null;
		try {
			System.out.println("Entered statement");
			out = new PrintWriter(new FileWriter("Output.txt"));
		}
		catch(IOException e){
			
		}
 finally {
	 if(out!=null);
	 {
		 System.out.println("Closing");
		 out.close();
	 } 
	 
 }
	}

}
