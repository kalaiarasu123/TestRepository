package week1.day2;

import java.util.Arrays;

public class LearningArray {

	public static void  main(String[] args) {
		//Sort an Array
		// int[] rollnumer = {11,13,89,67};
		// String[] str = {"a" , "b"};
		// String intstring = Arrays.toString(rollnumer);
		// boolean intstring = Arrays.asList(str).contains("a");
		 
		// System.out.println(rollnumer);
		// Arrays.sort(rollnumer);
		// for(int temp : rollnumer)

		// System.out.println("Roll Number is" +intstring);
		//two given Array is equal or not
			/*	 int[] rollnumer1 = {11,13,89,67};
				 int[] rollnumer2 = {11,13,89,98};
				
				 System.out.println("Roll Number is" + Arrays.equals(rollnumer1, rollnumer2));*/
		//Intersection of two given Array is equal or not
				 int[] rollnumer1 = {11,13,89,67};
				 int[] rollnumer2 = {11,13,89,98};
				 Arrays.sort(rollnumer1);
				 Arrays.sort(rollnumer2);
				 for(int i=0;i<=rollnumer1.length;i++) {
					 for(int j=0;j<=rollnumer2.length;j++) {
						 
					     if( rollnumer1[i]== rollnumer2[j]) {
							 System.out.println(rollnumer1[i]);
						 }
						 
					 }
				 }
			 }
		
	

}
