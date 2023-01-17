package exceptionHandling;

import java.util.Scanner;

public class ClassNotFound
{
	public static void main(String[] args)
	{
		String s;
		System.out.println("Enter Class Name");
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		
		try
		{
			Class.forName(s);
			System.out.println("Found!");
		}
		catch (ClassNotFoundException cne)
		{
			System.out.println("Class not Exists!");
		}
	}
}
