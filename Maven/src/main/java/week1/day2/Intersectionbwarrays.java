package week1.day2;

import java.util.Arrays;

public class Intersectionbwarrays {

	public static void main(String[] args) {
         int[] aray1 = {9,4,5,6};
         int[] aray2 = {1,3,8,9};
         int[] aray3 = {7,2};
     Arrays.sort(aray1);  
     Arrays.sort(aray2);  
     Arrays.sort(aray3);  
     for(int i=0; i<aray1.length;i++) {
    	 //System.out.println(aray1[i]);
    	 
     
     for(int j=0; j<aray2.length;j++) {
		 //System.out.println(aray2[j]);
    	 for(int k=0; k<aray3.length;k++) {
     if( aray1[i]==aray2[j] && aray2[j]==aray3[k] ) {
    	System.out.println(aray1[i]);
     }
     else {
    	// System.out.println(aray1[i]);
     }
     }
     }
     }
	}

}
