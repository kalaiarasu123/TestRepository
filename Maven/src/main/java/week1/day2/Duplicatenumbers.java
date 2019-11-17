package week1.day2;

import java.util.Arrays;

public class Duplicatenumbers {

	public static void main(String[] args) {
		
		 int[] array1 = {9,4,5,6,9};
		 Arrays.sort(array1);
		 for(int i=0; i<array1.length-1;i++) {
			 if(array1[i]==array1[i+1]) {
			 System.out.println(array1[i]);
			 }
		 }
		 
	}

}
