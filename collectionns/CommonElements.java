package collectionns;

import java.util.HashSet;

public class CommonElements
{
	public static void main(String[] args)
	{
		HashSet<String> colors1 = new HashSet<String>(){{add("Violet"); add("White"); add("Black"); add("Red"); add("Blue"); add("Green"); add("Yellow");}};
		HashSet<String> colors2 = new HashSet<String>(){{add("Orange"); add("Brown"); add("Blue"); add("White"); add("Red"); add("Black"); add("Green");}};
		
		colors2.retainAll(colors1);
		
		System.out.println(colors1+"\n");
		System.out.println(colors2+"\n");
		System.out.println("\n\nCommon Elements : ");
		System.out.println(colors2);
	}

}
