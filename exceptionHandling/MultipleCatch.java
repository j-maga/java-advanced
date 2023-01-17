package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch
{
	public static void main(String[] args)
	{
		
		try
		{
			int a[]=new int[3];
			a[5]=10/0;
		}
				
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("ArrayIndexException occurs");
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		
		catch(Exception e)
		{
			System.out.println("Parent Exception Class");
		}
           
	}

}
