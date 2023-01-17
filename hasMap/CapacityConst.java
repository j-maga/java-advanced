package hasMap;

import java.util.HashMap;

public class CapacityConst
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hash = new HashMap<Integer, String>(4);
		hash.put(1, "Apple");
		hash.put(2, "Orange");
		hash.put(3, "Grapes");
		hash.put(4, "Cherry");
		hash.put(5, "Lemon");
		hash.put(6, "PineApple");
		hash.put(7, "Strawberry");
		hash.put(8, "Mango");
		
		System.out.println("\nHashmap Contains \n\n"+hash);
	}
}
