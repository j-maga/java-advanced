package hasMap;

import java.util.HashMap;
import java.util.Map;

public class Traverse
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1, "Apple");
		hash.put(2, "Orange");
		hash.put(3, "Grapes");
		hash.put(4, "Cherry");
		hash.put(5, "Lemon");
		hash.put(6, "Strawberry");
		hash.put(7, "Mango");
		
		System.out.println("HashMap : " +hash);
		
		System.out.println("\nAccessing Value of particular key (3)"+hash.get(3));
		System.out.println("\nAccessing all the keys "+hash.keySet());
		System.out.println("\nAccessing all the values "+hash.values());
		System.out.println("\nAccessing all the Key-value Pairs "+hash.entrySet());
		
		System.out.println("\nTraversing the HashMap ");
		for(Map.Entry<Integer, String> e:hash.entrySet())
			System.out.println(e.getKey()+" : "+e.getValue());
		
		hash.clear();
		System.out.println("\n"+hash);

	}
}
