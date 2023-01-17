package genericprogramming;

import java.util.Arrays;
import java.util.List;

public class Wildcard
{
	private static double sum(List<? extends Number>list)
	{
		double sum = 0.0;
		for (Number i:list)
			sum+=i.doubleValue();
		return sum;
	}
	
	public static void main(String[] args)
	{
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
		System.out.println("Total Sum - "+sum(list1));
		List<Double> list2 = Arrays.asList(4.1, 5.2, 6.3, 7.4);
		System.out.println("Total Sum - "+sum(list2));
	}
}
