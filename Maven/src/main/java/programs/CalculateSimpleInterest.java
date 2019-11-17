package programs;

import java.util.Scanner;

public class CalculateSimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Principlal;
		int year;
		double Rate;
		double simpleInterest;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the principal amt");
		Principlal = in.nextDouble();
		System.out.println("Enter the year");
		year = in.nextInt();
		System.out.println("Enter the Rate of Ineterst");
		Rate = in.nextDouble();
		
		simpleInterest = (Principlal*year*Rate)/100;
		
		System.out.println("Simple Interst is"+simpleInterest);
		
		

	}

}
