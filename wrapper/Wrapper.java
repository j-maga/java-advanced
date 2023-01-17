package wrapper;

public class Wrapper {
	public static void main(String[] args)
	{
		int a=10;
		
		Integer A = new Integer(a);
		Integer B = a;
		
		int b = A.intValue();
		int c = A;
		
		System.out.println(b);
		System.out.println(c);
	}
}