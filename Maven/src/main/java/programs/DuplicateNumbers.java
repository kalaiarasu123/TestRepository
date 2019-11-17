package programs;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int[] a = {3,6,3,8};
			for(int i=0;i<a.length;i++)	{
				for (int j=i+1;j<a.length;j++) {
					if(a[i]==a[j] &&  i!=j) {
						System.out.println(a[j]);
					}
				}
				
			}

	}

}
