package collectionns;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class SearchHashTable
{
	public static void main(String[] args)
	{
		String value;
		int vaLue;
		
		Hashtable <Integer, String> ht = new Hashtable <Integer, String> ();
		ht.put(1, "Albert");
		ht.put(7, "Oliver");
		ht.put(3, "James");
		ht.put(5, "Lucas");
		ht.put(6, "Michael");
		ht.put(2, "Daniel");
		ht.put(4, "Leo");
		
		
		
		
		System.out.println("Number of Elemets : "+ht.size());
		System.out.println("\nHashtable contains "+ht);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nSearch the HashTable\n- 1.by value\n- 2.by key");
		int choice = sc.nextInt();
		
		if (choice==1)
		{
			System.out.println("\nEnter value");
			value = sc.next();
			if(ht.containsValue(value))
				System.out.println("Value "+value+" is present!");
			else
				System.out.println("Not present in HashTable!");
		}
		else if (choice==2)
		{
			System.out.println("\nEnter key");
			vaLue = sc.nextInt();
			if(ht.containsKey(vaLue))
				System.out.println("Key "+vaLue+" is present!");
			else
				System.out.println("Not present in HashTable!");
		}
		else
		{
			System.out.println("Invalid Option!");
		}
	}

}
