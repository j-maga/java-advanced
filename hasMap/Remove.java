package hasMap;

import java.util.HashMap;

public class Remove
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1, "Apple");
		hash.put(2, "Orange");
		hash.put(3, "Apple");
		hash.put(4, "Strawberry");
		hash.put(5, "Cherry");
		hash.put(6, "Grapes");
		hash.put(7, "Lemon");
		
		System.out.println("\nHashMap Contains "+hash);
		
		hash.remove(5);
		System.out.println("\nHashMap Contains "+hash);
		
		hash.values().remove("Lemon");
		System.out.println("\nHashMap Contains "+hash);
		
		hash.remove(2, "Orange");
		System.out.println("\nHashMap Contains "+hash);
		
		hash.remove(4, "Apple");
		System.out.println("\nHashMap Contains "+hash);
	}
}
