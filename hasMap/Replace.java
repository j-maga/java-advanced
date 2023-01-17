package hasMap;

import java.util.HashMap;

public class Replace
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
		
		System.out.println("\nHashmap : "+hash);
		
		hash.replace(5, "Lemon");
		System.out.println("\nHashMap : "+hash);
				
		System.out.println(hash.replace(5, "Cherry", "Lemon"));
		hash.replace(5, "Lemon", "Cherry");
		System.out.println("\nHashMap : "+hash);
	}
}