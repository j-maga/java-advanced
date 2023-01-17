package collectionns;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList
{
	public static void main(String[] args)
	{
		int choice, index;
		int optiOn;
		char option;
		String value;
		
		ArrayList colors = new ArrayList() {{add("Red"); add("Blue"); add("White"); add("Yellow");}};
		
		System.out.println("- - ArrayList Implementation - -");
		
		System.out.println("\n1. Insert \t2.Retrieve \t3.Remove \t4.Print");
		
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
				System.out.println("Do you want to add element at particular index? y/n");
				option = sc.next().charAt(0);
				
				if (option=='y')
				{
					System.out.println("Enter index ");
					index = sc.nextInt();
					colors.add(index, value);
				}
				else if(option=='n')
				{
					colors.add(value);
				}
				else
					System.out.println("Invalid!");
				break;
			
			case 2:
				System.out.println("Enter index to Retrieve ");
				index = sc.nextInt();
				System.out.println("Ok! Element at index "+index +" is "+colors.get(index));
				break;
				
			case 3:
				System.out.println("Delete - 1.by index\t2.by value");
				optiOn = sc.nextInt();
				if(optiOn==1)
				{
					System.out.println("Index ? ");
					index = sc.nextInt();
					colors.remove(index);
				}
				else if(optiOn==2)
				{
					System.out.println("Value ? ");
					value = sc.next();
					colors.remove(value);
				}
				else
					System.out.println("Invalid!");
				break;
			
			case 4:
				System.out.println("Colors ArrayList : "+colors);
				break;
			}
		}while(choice>0 && choice<5);

	}

}
