package collectionns;

import java.util.Collections;
import java.util.LinkedList;

public class SortReverse
{
	public static void main(String[] args)
	{
		LinkedList <String>colors = new LinkedList<String>()
		{{add("Red"); add("Blue"); add("White"); add("Yellow"); add("Green"); add("Violet"); add("Black"); add("Orange");}};
		
		System.out.println("Normal List : "+colors+"\n\n");
		
		Collections.sort(colors);
		System.out.println(colors);
		System.out.println("Elements Sorted!\n\n");
		
		Collections.reverse(colors);
		System.out.println(colors);
		System.out.println("Elements Reversed!");
	}

}
