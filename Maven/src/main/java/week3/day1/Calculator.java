package week3.day1;

public class Calculator {
	public int add(int x,int y) {
		int z;
		z=x+y;
		return z;
		
	}
	public int add(int x,int y, int z) {
	   int a;
		a=x+y+z;
		System.out.println(a);
		return a;
	}
	public double add(int x,double y) {
		   double z;
			z=x+y;
			System.out.println(z);
			return z;
		}
	public double add(double x,double y,double z) {
		double a;
			a=x+y+z;
			System.out.println(a);
			return a;
		}
	
}
