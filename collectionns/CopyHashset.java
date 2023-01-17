package collectionns;

import java.util.HashSet;

public class CopyHashset
{
	public static void main(String[] args)
	{
		HashSet<String> colors = new HashSet(){{add("Violet"); add("White"); add("Black"); add("Red"); add("Blue"); add("Green"); add("Yellow");}};
		System.out.println("Hash Set Elements : "+colors);
		
		String[] color = new String[colors.size()];
		colors.toArray(color);
		
		System.out.println("\n\nHashSet in an Array :");
		
		for(String i:color)
			System.out.print(i+", ");
	}

}
