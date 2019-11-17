package week1.day2;

import java.util.Arrays;

public class MaximumandMinimum {

	public static void main(String[] args) {	
       int[] data = {5,4,2,9};
       Arrays.sort(data);
       System.out.println(data[0]);
       System.out.println(data[data.length-1]);
	}

}
