package typecast;

public class InttoString {
	public static void main(String[] args) {
		int a, b, c;
		String A, B, C;
		
		a=10;
		b=20;
		c=30;
		
		A = String.valueOf(a);
		B = Integer.toString(b);
		C = String.format("%d", c);
		
		System.out.println("Output "+ (A+B+C));
	}

}
