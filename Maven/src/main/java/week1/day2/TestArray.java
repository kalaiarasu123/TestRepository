package week1.day2;

public class TestArray {
	public static void  main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		for (int i=0; i<arr.length;i++) {
			if(i<=5) {
				System.out.println("Exit");
				System.exit(0);
			}
			else
			{
				System.out.println("arr["+i+"]="+arr[i]);
			}
			System.out.println("End of Program");
		}
		
	}
}
