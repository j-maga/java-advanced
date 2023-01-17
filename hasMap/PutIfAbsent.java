package hasMap;

import java.util.HashMap;

public class PutIfAbsent
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1, "Apple");
		hash.put(2, "Orange");
		hash.put(3, "Apple");
		hash.put(4, "Strawberry");
		hash.put(5, "Cherry");
		
		System.out.println("\nHashmap Contains "+hash);
		
		hash.putIfAbsent(6, "PineApple");
		System.out.println("\nHashMap Contains "+hash);
		
		hash.putIfAbsent(4, "PineApple");
		System.out.println("\nHashMap Contains "+hash);
		
		HashMap <Integer, String> nhash = new HashMap<Integer, String>();
		nhash.putAll(hash);
	}
}