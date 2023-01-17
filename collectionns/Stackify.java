package collectionns;

import java.util.Scanner;
import java.util.Stack;

public class Stackify 
{
	public static void main(String[] args)
	{
		int choice;
		String value;
		Stack<String> s = new Stack<>() {{add("Violet"); add("White"); add("Black"); add("Red");}};
		System.out.println("Stack : "+s);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n1.Push\t2.Pop\t3.Search\n");
		
		do
		{
			System.out.println("\nEnter your choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter value to push into the Array ");
				value = sc.next();
				s.push(value);
				System.out.println("Value Pushed!");
				break;
			case 2:
				s.pop();
				System.out.println("Value Poped!");
				break;
			case 3:
				System.out.println("Enter value to check : ");
				value = sc.next();
				System.out.println("Stack has value ? "+s.contains(value));
				break;
			}	
		}while (choice>0 && choice<4);
		
	}
}
