package exceptionHandling;

import java.util.Scanner;

public class Throw3
{
	public static void main(String[] args)
	{
		int age;
		System.out.println("Valid to Vote?\n");
		System.out.println("Enter your age when you voted last time ");
		Scanner sc = new Scanner(System.in);
		
		
		age = sc.nextInt();
			
		if (age>18)
		{
			System.out.println("\nEligible to vote!");
		}
		else
		{
			throw new ArithmeticException();
		}
	}
}
