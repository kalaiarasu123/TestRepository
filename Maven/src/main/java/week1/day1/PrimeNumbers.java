package week1.day1;

public class PrimeNumbers {
	public static int i=0;
	public static int num=0;
    public static String prime = "";
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
	       int count = 0;
	       for(num=i; num>=1; num--) {
		if(i%num==0) {
			count = count + 1;
		}

	}
	       if(count ==2)
	       {
	    	   prime = prime + i + "";
	       }

}
		System.out.println("Prime Numers are:");
		System.out.println(prime);
	}
}
