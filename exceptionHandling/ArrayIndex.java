package exceptionHandling;

import java.util.Scanner;

public class ArrayIndex
{
	public static void main(String[] args)
	{
		int A[] = new int[5];
		int index;
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements for the Array");
		
		for (int i=0; i<5; i++)
			A[i] = sc.nextInt();
		
		System.out.println("Enter index to access the Element of Array");
		index = sc.nextInt();
		
		try
		{
			System.out.println("\nAccessing "+ index +"th index of the Array A["+index+"] = ");
			System.out.print(A[index]);
		}
		
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("\nIndex of Array Size 5 is from 0 to 4");
		}
	}
}