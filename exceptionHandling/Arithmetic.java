package exceptionHandling;

import java.util.Scanner;

public class Arithmetic
{
	public static void main(String[] args)
	{
		int a, b;
		System.out.println("- - Divison - -\nEnter Numerator ");
		Scanner sc = new Scanner (System.in);
		a=sc.nextInt();
		System.out.println("Enter Denominator ");
		b=sc.nextInt();
		
		try
		{
			System.out.println("\n"+a +" divided by "+ b+"\nOutput: ");
			int div = a/b;
			System.out.print(div);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("\nDenominator can't be zero! ");
		}
		
	}
}
