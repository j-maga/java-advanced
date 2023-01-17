package typecast;

public class StringtoInt {
	public static void main(String[] args) {
		String a, b;
		int A, B, C;
		
		a="10";
		b="20";
		
		A = Integer.valueOf(a);
		B = Integer.parseInt(b);
		C = A+B;
		
		System.out.println("Output "+ A+B);
		System.out.println("Output "+ (A+B));
		System.out.println("Output "+ C);
	}

}

