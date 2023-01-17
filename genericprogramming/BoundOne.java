package genericprogramming;

public class BoundOne
{
	public static <E extends Number> void printArr(E[] ele)
	{
		for (E e:ele)
			System.out.println(e);
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Integer[] iArr = {10, 20, 30};
		Character[] cArr = {'m', 'a', 'g', 'a'};
		
		printArr(iArr);
		//printArr(cArr);
	}
}
