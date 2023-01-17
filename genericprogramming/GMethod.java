package genericprogramming;

public class GMethod 
{
	<T> void print(T[] input)
	{
		for (T ele:input)
			System.out.print(ele+"  ");
		System.out.println();
	}
	
	public static<U> void printA(U[] input)
	{
		for (U ele:input)
			System.out.print(ele+"  ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		GMethod gm = new GMethod();
		Integer[] iArr = {1, 2, 3};
		Float[] fArr = {0.5f, 0.15f, 0.25f};
		gm.print(iArr);
		printA(fArr);
	}

}
