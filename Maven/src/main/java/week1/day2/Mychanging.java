package week1.day2;

public class Mychanging {
	public  Mychanging() {
		System.out.println("default constructor");
	}
	

	public Mychanging(int i) {
		this();
		System.out.println("single constructor");
	}

	public  Mychanging(int i, int j) {
		this(j);
		System.out.println("Doule constructor");
	}

	public static void main(String[] args) {
		Mychanging Lp = new Mychanging();
	}

}
