package week1.day1;

public class Fibbonacci {

	public static void main(String[] args) {
		int x=0;
		int y=1;
		int z=0;
		System.out.println(x);
		System.out.println(y);
		for(int i=0; i<=6; i++) {
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		
		}

	}

}
