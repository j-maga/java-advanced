package collectionns;

import java.util.LinkedList;
import java.util.Scanner;

public class Linklist
{
	public static void main(String[] args)
	{
		int choice, index;
		int optiOn;
		char option;
		String value;
		
		LinkedList colors = new LinkedList() {{add("Red"); add("Blue"); add("White"); add("Yellow");}};
		
		System.out.println("- - ArrayList Implementation - -");
		
		System.out.println("\n1.Offer(Add) \t2.Retrieve \t3.Poll(Remove) \t4.Print");
		
		Scanner sc = new Scanner(System.in);
		
		
		do
		{
			System.out.println("\nEnter your Choice ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter value to add ");
				value = sc.next();
				colors.offer(value);
				break;
			
			case 2:
				System.out.println("Enter index to Retrieve ");
				index = sc.nextInt();
				System.out.println("Ok! Element at index "+index +" is "+colors.get(index));
				break;
				
			case 3:
				colors.poll();
				System.out.println("Value Deleted!");
				break;
			
			case 4:
				System.out.println("Colors ArrayList : "+colors);
				break;
			}
		}while(choice>0 && choice<5);

	}

}
