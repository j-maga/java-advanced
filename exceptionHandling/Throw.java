package exceptionHandling;

import java.util.Scanner;

public class Throw
{
	public static void main(String[] args)
	{
		int age;
		System.out.println("\nValid to Vote?\n");
		System.out.println("Enter your age ");
		Scanner sc = new Scanner(System.in);
		
		
		age = sc.nextInt();
		
		try
		{
			if (((Object)age).getClass().getSimpleName()!="Integer")
			{
				throw new ArithmeticException("Check your input!");
			}
			
			else
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
		}
		catch(ArithmeticException ae)
		{
			System.out.println("\nInvalid Input!");
		}
		
	}
}
