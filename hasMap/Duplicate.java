package hasMap;

import java.util.HashMap;

public class Duplicate
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1, "Apple");
		hash.put(2, "Orange");
		hash.put(3, "Apple");
		System.out.println("Hashmap Contains "+hash);
		
		System.out.println("\nDuplicate Values Present !\n");
		
		hash.put(4, "Apple");
		System.out.println("HashMap Contains "+hash);
	}
}