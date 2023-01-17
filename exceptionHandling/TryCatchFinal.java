package exceptionHandling;

import java.util.Scanner;

public class TryCatchFinal
{

	public static void main(String[] args)
	{
		int a, b=0;
		float div;
		System.out.println("\n- - - Divison - - -\n");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.println(a +"/"+ b +" = ");
		
		try
		{
			div = a/b;
			System.out.print(div);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("\nArithmetic Exception Found ! : Divide by Zero");
		}
		
		finally
		{
			System.out.println("\nIf Demoninator is Zero, JVM will throw Arithmetic Exception");
		}

	}

}
