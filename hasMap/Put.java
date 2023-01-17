package hasMap;

import java.util.HashMap;

public class Put
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1, "Apple");
		hash.put(2, "Orange");
		hash.put(3, "Grapes");
		System.out.println("\nHashmap Contains "+hash);
		
		hash.put(2, "Strawberry");
		System.out.println("\nHashMap Contains "+hash);
		
		hash.put(4, "Oranges");
		System.out.println("\nHashMap Contains "+hash);
	}
}
