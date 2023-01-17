package typecast;

public class Explicit {
	public static void main(String[] args) {
		int a[] = new int[3];
		String A[] = new String[] {"12", "24", "36"};
		
		a[0] = Integer.valueOf(A[0]);
		a[1] = Integer.valueOf(A[1]);
		a[2] = Integer.valueOf(A[2]);
		
		System.out.println(a[2]);
		System.out.println(a[1]);
		System.out.println(a[0]);
	}
}
