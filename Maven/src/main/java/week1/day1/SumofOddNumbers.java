package week1.day1;

public class SumofOddNumbers {
      public static int x=0;
      public static int y=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++) {
			
			if( i%2 !=0) {
			
				//System.out.print(i);
				x = x +i;
			}
		}
		System.out.print(x);
	}

}
