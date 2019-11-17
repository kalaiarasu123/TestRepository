package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "Hello";
		String string3 = new String("Hello");
		System.out.println(string1==string2);
		System.out.println(string1==string3);
		System.out.println(string1.equals(string2));
		System.out.println(string1.equals(string3));
	}

}
