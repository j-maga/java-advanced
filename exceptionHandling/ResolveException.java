package exceptionHandling;

import java.util.Scanner;

public class ResolveException
{

	public static void main(String[] args)
	{
		int age;
		System.out.println("Valid to Vote?\n");
		System.out.println("Enter your age when you voted last time ");
		Scanner sc = new Scanner(System.in);
		
		
		age = sc.nextInt();
		
		try
		{
			if ((((Object)age).getClass().getTypeName()).equals("java.lang.Integer"))
			{
				if (age>18)
				{
					System.out.println("\nEligible to vote!");
				}
				else
				{
					System.out.println("\nNot Eligible to vote!");
				}
			}
			
			else
			{
				throw new ArithmeticException();
			}
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("\nInvalid Input!");
		}
		
	}
}
