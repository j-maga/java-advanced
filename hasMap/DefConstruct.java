package hasMap;

import java.util.HashMap;

public class DefConstruct
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1, "Apple");
		hash.put(2, "Orange");
		hash.put(3, "Grapes");
		hash.put(4, "Cherry");
		hash.put(5, "Lemon");
		
		System.out.println("\nHashmap Contains "+hash);
	}
}
