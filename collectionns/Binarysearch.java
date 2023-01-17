package collectionns;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch
{
	public static void main(String[] args)
	{
		int Arr[] = new int[10], search;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 Num in Array : ");
		
		for (int i=0; i<10; i++)
			Arr[i] = sc.nextInt();
		
		Arrays.sort(Arr);
		
		for(int i=0; i<10; i++)
			System.out.print(Arr[i]+" ");
		
		System.out.println("Array Sorted!\n\n\nEnter the Element you want to search : ");
		search = sc.nextInt();
				
		int first =0;
		int last = 10;
		
		
		while (first <= last)
		{
			int mid = (first+last)/2;
			
			if (Arr[mid]<search)
				first = mid+1;
			else if (Arr[mid]>search)
				last = mid-1;
			else if (Arr[mid]==search)
			{
				System.out.println(search +" Found!");
				break;
			}
		}
		
		if(first>last)
			System.out.println("Not Found");
		
	}

}
