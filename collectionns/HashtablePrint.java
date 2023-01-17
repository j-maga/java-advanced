package collectionns;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtablePrint
{
	public static void main(String[] args)
	{
		Hashtable <Integer, String> ht = new Hashtable <Integer, String> ();
		ht.put(1, "Albert");
		ht.put(7, "Oliver");
		ht.put(3, "James");
		ht.put(5, "Lucas");
		ht.put(6, "Michael");
		ht.put(2, "Daniel");
		ht.put(4, "Leo");
		
		System.out.println("Number of Elemets : "+ht.size());
		
		System.out.println("\nHashtable contains \n"+ht);
		
		System.out.println("\n\n- - HashTable - -");
		Enumeration value = ht.elements();
		
		while(value.hasMoreElements())
			System.out.println(value.nextElement());
	}

}
