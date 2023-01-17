package exceptionHandling;

import java.util.Scanner;

public class NumberFormat
{
	public static void main(String[] args)
	{
		String s;
		System.out.println("Enter your ID Number ");
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		
		try
		{
			int id = Integer.parseInt(s);
			System.out.println("Your ID is "+id);
		}
		
		catch(NumberFormatException ne)
		{
			System.out.println("\nID must be Integer Value!");
		}
	}
}
