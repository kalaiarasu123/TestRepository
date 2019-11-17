package programs;

import java.util.Arrays;

public class SingleArray {

	public static void main(String[] args) {
		int[][][] a = {{{1,2},{6,7}},{{6,7},{8,6}}};
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			for(int k=0;k<2;k++)
			{
			System.out.print(a[i][j][k] +" ");
			}
			System.out.println();
		}
		System.out.println();
	}
				

	}

}
