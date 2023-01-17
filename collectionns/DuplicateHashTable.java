package collectionns;

import java.util.Enumeration;
import java.util.Hashtable;

public class DuplicateHashTable
{
	public static void main(String[] args)
	{
		Hashtable <Integer, String> ht = new Hashtable <Integer, String> ();
		ht.put(1, "Albert");
		ht.put(6, "Oliver");
		ht.put(2, "James");
		ht.put(4, "Lucas");
		ht.put(5, "Michael");
		ht.put(3, "Leo");
		
		System.out.println("Number of Elemets : "+ht.size());
		
		System.out.println("\nHashtable contains \n"+ht);
		
		ht.put(4, "William");
		System.out.println("\n\nAdding William in key 4\n");
		
		System.out.println(ht);
	}
}
