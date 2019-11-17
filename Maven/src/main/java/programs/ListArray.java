package programs;

import java.util.ArrayList;
import java.util.Arrays;

public class ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // String[] str = {"abc", "cvb","yut"};
         // ArrayList<String> List = new  ArrayList<String>();     
          //System.out.println(Arrays.asList(str));
		int[] num = {78,98,67,56};
		Arrays.sort(num);
		for(int i=0; i<num.length;i++) {
			if(i==num.length-2) {
				System.out.println(num[i]);
			}
		}
	}

}
